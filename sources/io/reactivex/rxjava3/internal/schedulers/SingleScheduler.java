package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleScheduler extends Scheduler {
    public static final RxThreadFactory d;
    public final AtomicReference c;

    public static final class ScheduledWorker extends Scheduler.Worker {
        public final ScheduledExecutorService a;
        public final CompositeDisposable b = new CompositeDisposable();
        public volatile boolean c;

        public ScheduledWorker(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.a;
            if (this.c) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.b);
            this.b.b(scheduledRunnable);
            ScheduledExecutorService scheduledExecutorService = this.a;
            try {
                scheduledRunnable.a(j <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z = SchedulerPoolFactory.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(SchedulerPoolFactory.a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker b() {
        return new ScheduledWorker((ScheduledExecutorService) this.c.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, true);
        AtomicReference atomicReference = this.c;
        try {
            scheduledDirectTask.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(scheduledDirectTask) : ((ScheduledExecutorService) atomicReference.get()).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        EmptyDisposable emptyDisposable = EmptyDisposable.a;
        AtomicReference atomicReference = this.c;
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, true);
            try {
                scheduledDirectPeriodicTask.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledExecutorService);
        try {
            instantPeriodicTask.a(j <= 0 ? scheduledExecutorService.submit((Callable) instantPeriodicTask) : scheduledExecutorService.schedule((Callable) instantPeriodicTask, j, timeUnit));
            return instantPeriodicTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.b(e2);
            return emptyDisposable;
        }
    }
}
