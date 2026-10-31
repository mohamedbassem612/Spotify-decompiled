package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public pnc1 e;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber delaySubscriber = DelaySubscriber.this;
                Scheduler.Worker worker = delaySubscriber.d;
                try {
                    delaySubscriber.a.onComplete();
                } finally {
                    worker.dispose();
                }
            }
        }

        public final class OnError implements Runnable {
            public final Throwable a;

            public OnError(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber delaySubscriber = DelaySubscriber.this;
                Scheduler.Worker worker = delaySubscriber.d;
                try {
                    delaySubscriber.a.onError(this.a);
                } finally {
                    worker.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {
            public final Object a;

            public OnNext(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DelaySubscriber.this.a.onNext(this.a);
            }
        }

        public DelaySubscriber(gnc1 gnc1Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.a = gnc1Var;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
        }

        public final void cancel() {
            this.e.cancel();
            this.d.dispose();
        }

        public final void onComplete() {
            this.d.b(new OnComplete(), this.b, this.c);
        }

        public final void onError(Throwable th) {
            this.d.b(new OnError(th), 0L, this.c);
        }

        public final void onNext(Object obj) {
            this.d.b(new OnNext(obj), this.b, this.c);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        public final void request(long j) {
            this.e.request(j);
        }
    }

    public FlowableDelay(Flowable flowable, long j, Scheduler scheduler) {
        super(flowable);
        this.c = j;
        this.d = TimeUnit.MILLISECONDS;
        this.e = scheduler;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new DelaySubscriber(new SerializedSubscriber(gnc1Var), this.c, this.d, this.e.b()));
    }
}
