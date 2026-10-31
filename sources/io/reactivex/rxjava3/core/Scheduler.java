package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.schedulers.NewThreadWorker;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class Scheduler {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    public static final class DisposeTask implements Disposable, Runnable {
        public final Runnable a;
        public final Worker b;
        public Thread c;

        public DisposeTask(Runnable runnable, Worker worker) {
            this.a = runnable;
            this.b = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.c == Thread.currentThread()) {
                Worker worker = this.b;
                if (worker instanceof NewThreadWorker) {
                    NewThreadWorker newThreadWorker = (NewThreadWorker) worker;
                    if (newThreadWorker.b) {
                        return;
                    }
                    newThreadWorker.b = true;
                    newThreadWorker.a.shutdown();
                    return;
                }
            }
            this.b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c = Thread.currentThread();
            try {
                this.a.run();
                dispose();
                this.c = null;
            } catch (Throwable th) {
                try {
                    RxJavaPlugins.b(th);
                    throw th;
                } catch (Throwable th2) {
                    dispose();
                    this.c = null;
                    throw th2;
                }
            }
        }
    }

    public static abstract class Worker implements Disposable {
        public Disposable a(Runnable runnable) {
            return b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract Disposable b(Runnable runnable, long j, TimeUnit timeUnit);

        public final Disposable c(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            long nanos = timeUnit.toNanos(j2);
            long jA = Scheduler.a(TimeUnit.NANOSECONDS);
            Disposable disposableB = b(new PeriodicTask(this, timeUnit.toNanos(j) + jA, runnable, jA, sequentialDisposable2, nanos), j, timeUnit);
            if (disposableB == EmptyDisposable.a) {
                return disposableB;
            }
            DisposableHelper.c(sequentialDisposable, disposableB);
            return sequentialDisposable2;
        }
    }

    static {
        long nanos;
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            nanos = TimeUnit.SECONDS.toNanos(jLongValue);
        } else {
            nanos = "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
        }
        b = nanos;
    }

    public static long a(TimeUnit timeUnit) {
        return !a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract Worker b();

    public Disposable c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        Worker workerB = b();
        Objects.requireNonNull(runnable, "run is null");
        DisposeTask disposeTask = new DisposeTask(runnable, workerB);
        workerB.b(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public Disposable e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Worker workerB = b();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(runnable, workerB);
        Disposable disposableC = workerB.c(periodicDirectTask, j, j2, timeUnit);
        return disposableC == EmptyDisposable.a ? disposableC : periodicDirectTask;
    }
}
