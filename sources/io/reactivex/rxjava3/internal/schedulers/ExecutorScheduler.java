package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ExecutorScheduler extends Scheduler {
    public final boolean c;
    public final boolean d;
    public final Executor e;

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        public final boolean a;
        public final boolean b;
        public final Executor c;
        public volatile boolean e;
        public final AtomicInteger f = new AtomicInteger();
        public final CompositeDisposable g = new CompositeDisposable();
        public final MpscLinkedQueue d = new MpscLinkedQueue();

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
            public final Runnable a;

            public BooleanRunnable(Runnable runnable) {
                this.a = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.a.run();
                    lazySet(true);
                } catch (Throwable th) {
                    try {
                        RxJavaPlugins.b(th);
                        throw th;
                    } catch (Throwable th2) {
                        lazySet(true);
                        throw th2;
                    }
                }
            }
        }

        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {
            public final Runnable a;
            public final DisposableContainer b;
            public volatile Thread c;

            public InterruptibleRunnable(Runnable runnable, DisposableContainer disposableContainer) {
                this.a = runnable;
                this.b = disposableContainer;
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            DisposableContainer disposableContainer = this.b;
                            if (disposableContainer != null) {
                                disposableContainer.c(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.c;
                        if (thread != null) {
                            thread.interrupt();
                            this.c = null;
                        }
                        set(4);
                        DisposableContainer disposableContainer2 = this.b;
                        if (disposableContainer2 != null) {
                            disposableContainer2.c(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.c = null;
                        return;
                    }
                    try {
                        this.a.run();
                        this.c = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } else {
                            DisposableContainer disposableContainer = this.b;
                            if (disposableContainer != null) {
                                disposableContainer.c(this);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            RxJavaPlugins.b(th);
                            throw th;
                        } catch (Throwable th2) {
                            this.c = null;
                            if (compareAndSet(1, 2)) {
                                DisposableContainer disposableContainer2 = this.b;
                                if (disposableContainer2 != null) {
                                    disposableContainer2.c(this);
                                }
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th2;
                        }
                    }
                }
            }
        }

        public ExecutorWorker(Executor executor, boolean z, boolean z2) {
            this.c = executor;
            this.a = z;
            this.b = z2;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable a(Runnable runnable) {
            Disposable booleanRunnable;
            EmptyDisposable emptyDisposable = EmptyDisposable.a;
            if (this.e) {
                return emptyDisposable;
            }
            if (this.a) {
                booleanRunnable = new InterruptibleRunnable(runnable, this.g);
                this.g.b(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnable);
            }
            this.d.offer(booleanRunnable);
            if (this.f.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.c.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e) {
                this.e = true;
                this.d.clear();
                RxJavaPlugins.b(e);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.a;
            if (j <= 0) {
                return a(runnable);
            }
            if (this.e) {
                return emptyDisposable;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(this, sequentialDisposable2, runnable), this.g);
            this.g.b(scheduledRunnable);
            Executor executor = this.c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.a(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.e = true;
                    RxJavaPlugins.b(e);
                    return emptyDisposable;
                }
            } else {
                scheduledRunnable.a(new DisposeOnCancel(SingleHolder.a.d(scheduledRunnable, j, timeUnit)));
            }
            DisposableHelper.c(sequentialDisposable, scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.g.dispose();
            if (this.f.getAndIncrement() == 0) {
                this.d.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.b;
            MpscLinkedQueue mpscLinkedQueue = this.d;
            if (z) {
                if (this.e) {
                    mpscLinkedQueue.clear();
                    return;
                }
                ((Runnable) mpscLinkedQueue.poll()).run();
                if (this.e) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    if (this.f.decrementAndGet() != 0) {
                        this.c.execute(this);
                        return;
                    }
                    return;
                }
            }
            int iAddAndGet = 1;
            while (!this.e) {
                while (true) {
                    Runnable runnable = (Runnable) mpscLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    runnable.run();
                    if (this.e) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.e) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.f.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }
    }

    public ExecutorScheduler(Executor executor, boolean z, boolean z2) {
        this.e = executor;
        this.c = z;
        this.d = z2;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker b() {
        return new ExecutorWorker(this.e, this.c, this.d);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable c(Runnable runnable) {
        Executor executor = this.e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, z2);
                scheduledDirectTask.a(((ExecutorService) executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (z2) {
                ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(runnable, null);
                executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnable);
            executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.e;
        if (!(executor instanceof ScheduledExecutorService)) {
            DelayedRunnable delayedRunnable = new DelayedRunnable(runnable);
            DisposableHelper.c(delayedRunnable.a, SingleHolder.a.d(new DelayedDispose(this, delayedRunnable), j, timeUnit));
            return delayedRunnable;
        }
        try {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable, this.c);
            scheduledDirectTask.a(((ScheduledExecutorService) executor).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.a;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.e;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.e(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable, this.c);
            scheduledDirectPeriodicTask.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.b(e);
            return EmptyDisposable.a;
        }
    }
}
