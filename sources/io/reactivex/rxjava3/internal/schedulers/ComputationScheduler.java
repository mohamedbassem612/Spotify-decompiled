package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.ListCompositeDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p.cfm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ComputationScheduler extends Scheduler {
    public static final FixedSchedulerPool d;
    public static final RxThreadFactory e;
    public static final int f;
    public static final PoolWorker g;
    public final AtomicReference c;

    public static final class EventLoopWorker extends Scheduler.Worker {
        public final ListCompositeDisposable a;
        public final CompositeDisposable b;
        public final ListCompositeDisposable c;
        public final PoolWorker d;
        public volatile boolean e;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.d = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.a = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.b = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.c = listCompositeDisposable2;
            listCompositeDisposable2.b(listCompositeDisposable);
            listCompositeDisposable2.b(compositeDisposable);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable a(Runnable runnable) {
            return this.e ? EmptyDisposable.a : this.d.f(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.e ? EmptyDisposable.a : this.d.f(runnable, j, timeUnit, this.b);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.e;
        }
    }

    public static final class FixedSchedulerPool {
        public final int a;
        public final PoolWorker[] b;
        public long c;

        public FixedSchedulerPool(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new PoolWorker(threadFactory);
            }
        }

        public final PoolWorker a() {
            int i = this.a;
            if (i == 0) {
                return ComputationScheduler.g;
            }
            long j = this.c;
            this.c = 1 + j;
            return this.b[(int) (j % ((long) i))];
        }
    }

    public static final class PoolWorker extends NewThreadWorker {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        g = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        d = fixedSchedulerPool;
        for (PoolWorker poolWorker2 : fixedSchedulerPool.b) {
            poolWorker2.dispose();
        }
    }

    public ComputationScheduler() {
        FixedSchedulerPool fixedSchedulerPool = d;
        AtomicReference atomicReference = new AtomicReference(fixedSchedulerPool);
        this.c = atomicReference;
        FixedSchedulerPool fixedSchedulerPool2 = new FixedSchedulerPool(f, e);
        if (cfm0.o(atomicReference, fixedSchedulerPool, fixedSchedulerPool2)) {
            return;
        }
        for (PoolWorker poolWorker : fixedSchedulerPool2.b) {
            poolWorker.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker b() {
        return new EventLoopWorker(((FixedSchedulerPool) this.c.get()).a());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        PoolWorker poolWorkerA = ((FixedSchedulerPool) this.c.get()).a();
        poolWorkerA.getClass();
        Objects.requireNonNull(runnable, "run is null");
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, true);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = poolWorkerA.a;
        try {
            scheduledDirectTask.a(j <= 0 ? scheduledThreadPoolExecutor.submit(scheduledDirectTask) : scheduledThreadPoolExecutor.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.b(e2);
            return EmptyDisposable.a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((FixedSchedulerPool) this.c.get()).a().a;
        if (j2 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnable, scheduledThreadPoolExecutor);
            try {
                instantPeriodicTask.a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) instantPeriodicTask) : scheduledThreadPoolExecutor.schedule((Callable) instantPeriodicTask, j, timeUnit));
                return instantPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.b(e2);
            }
        } else {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, true);
            try {
                scheduledDirectPeriodicTask.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e3) {
                RxJavaPlugins.b(e3);
            }
        }
        return EmptyDisposable.a;
    }
}
