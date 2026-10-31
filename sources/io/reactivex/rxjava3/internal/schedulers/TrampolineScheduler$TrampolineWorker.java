package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TrampolineScheduler$TrampolineWorker extends Scheduler.Worker implements Disposable {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean d;

    public final class AppendToQueueTask implements Runnable {
        public final TrampolineScheduler$TimedRunnable a;

        public AppendToQueueTask(TrampolineScheduler$TimedRunnable trampolineScheduler$TimedRunnable) {
            this.a = trampolineScheduler$TimedRunnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.d = true;
            TrampolineScheduler$TrampolineWorker.this.a.remove(this.a);
        }
    }

    public final Disposable a(Runnable runnable) {
        return f(runnable, Scheduler.a(TimeUnit.MILLISECONDS));
    }

    public final Disposable b(final Runnable runnable, long j, TimeUnit timeUnit) {
        final long millis = timeUnit.toMillis(j) + Scheduler.a(TimeUnit.MILLISECONDS);
        return f(new Runnable(runnable, this, millis) { // from class: io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler$SleepingRunnable
            public final Runnable a;
            public final TrampolineScheduler$TrampolineWorker b;
            public final long c;

            {
                this.a = runnable;
                this.b = this;
                this.c = millis;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.b.d) {
                    return;
                }
                long jA = Scheduler.a(TimeUnit.MILLISECONDS);
                long j2 = this.c;
                if (j2 > jA) {
                    try {
                        Thread.sleep(j2 - jA);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        RxJavaPlugins.b(e);
                        return;
                    }
                }
                if (this.b.d) {
                    return;
                }
                this.a.run();
            }
        }, millis);
    }

    public void dispose() {
        this.d = true;
    }

    public final Disposable f(Runnable runnable, long j) {
        EmptyDisposable emptyDisposable = EmptyDisposable.a;
        if (!this.d) {
            TrampolineScheduler$TimedRunnable trampolineScheduler$TimedRunnable = new TrampolineScheduler$TimedRunnable(runnable, Long.valueOf(j), this.c.incrementAndGet());
            this.a.add(trampolineScheduler$TimedRunnable);
            if (this.b.getAndIncrement() != 0) {
                return Disposable.e(new AppendToQueueTask(trampolineScheduler$TimedRunnable));
            }
            int iAddAndGet = 1;
            while (true) {
                boolean z = this.d;
                PriorityBlockingQueue priorityBlockingQueue = this.a;
                if (z) {
                    priorityBlockingQueue.clear();
                    return emptyDisposable;
                }
                TrampolineScheduler$TimedRunnable trampolineScheduler$TimedRunnable2 = (TrampolineScheduler$TimedRunnable) priorityBlockingQueue.poll();
                if (trampolineScheduler$TimedRunnable2 == null) {
                    iAddAndGet = this.b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!trampolineScheduler$TimedRunnable2.d) {
                    trampolineScheduler$TimedRunnable2.a.run();
                }
            }
        }
        return emptyDisposable;
    }

    public boolean isDisposed() {
        return this.d;
    }
}
