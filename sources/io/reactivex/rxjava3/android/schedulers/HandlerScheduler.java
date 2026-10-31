package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class HandlerScheduler extends Scheduler {
    public final Handler c;
    public final boolean d = true;

    public static final class HandlerWorker extends Scheduler.Worker {
        public final Handler a;
        public final boolean b;
        public volatile boolean c;

        public HandlerWorker(Handler handler, boolean z) {
            this.a = handler;
            this.b = z;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final Disposable b(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.a;
            if (timeUnit == null) {
                bhn0.i("unit == null");
                return null;
            }
            if (this.c) {
                return emptyDisposable;
            }
            Handler handler = this.a;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            messageObtain.obj = this;
            if (this.b) {
                messageObtain.setAsynchronous(true);
            }
            this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.c) {
                return scheduledRunnable;
            }
            this.a.removeCallbacks(scheduledRunnable);
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {
        public final Handler a;
        public final Runnable b;
        public volatile boolean c;

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                RxJavaPlugins.b(th);
            }
        }
    }

    public HandlerScheduler(Handler handler) {
        this.c = handler;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker b() {
        return new HandlerWorker(this.c, this.d);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            bhn0.i("run == null");
            return null;
        }
        if (timeUnit == null) {
            bhn0.i("unit == null");
            return null;
        }
        Handler handler = this.c;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
        Message messageObtain = Message.obtain(handler, scheduledRunnable);
        if (this.d) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return scheduledRunnable;
    }
}
