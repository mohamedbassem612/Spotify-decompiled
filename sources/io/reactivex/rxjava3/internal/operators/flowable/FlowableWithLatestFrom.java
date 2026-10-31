package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction c;
    public final moy0 d;

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        public final WithLatestFromSubscriber a;

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber withLatestFromSubscriber) {
            this.a = withLatestFromSubscriber;
        }

        @Override // p.gnc1
        public final void onComplete() {
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            WithLatestFromSubscriber withLatestFromSubscriber = this.a;
            SubscriptionHelper.a(withLatestFromSubscriber.c);
            withLatestFromSubscriber.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.lazySet(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this.a.e, pnc1Var)) {
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, pnc1 {
        public final SerializedSubscriber a;
        public final BiFunction b;
        public final AtomicReference c = new AtomicReference();
        public final AtomicLong d = new AtomicLong();
        public final AtomicReference e = new AtomicReference();

        public WithLatestFromSubscriber(SerializedSubscriber serializedSubscriber, BiFunction biFunction) {
            this.a = serializedSubscriber;
            this.b = biFunction;
        }

        @Override // p.pnc1
        public final void cancel() {
            SubscriptionHelper.a(this.c);
            SubscriptionHelper.a(this.e);
        }

        @Override // io.reactivex.rxjava3.operators.ConditionalSubscriber
        public final boolean f(Object obj) {
            SerializedSubscriber serializedSubscriber = this.a;
            U u = get();
            if (u != null) {
                try {
                    Object objApply = this.b.apply(obj, u);
                    Objects.requireNonNull(objApply, "The combiner returned a null value");
                    serializedSubscriber.onNext(objApply);
                    return true;
                } catch (Throwable th) {
                    Exceptions.a(th);
                    cancel();
                    serializedSubscriber.onError(th);
                }
            }
            return false;
        }

        @Override // p.gnc1
        public final void onComplete() {
            SubscriptionHelper.a(this.e);
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            SubscriptionHelper.a(this.e);
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (f(obj)) {
                return;
            }
            ((pnc1) this.c.get()).request(1L);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            SubscriptionHelper.c(this.c, this.d, pnc1Var);
        }

        @Override // p.pnc1
        public final void request(long j) {
            SubscriptionHelper.b(this.c, this.d, j);
        }
    }

    public FlowableWithLatestFrom(Flowable flowable, BiFunction biFunction, moy0 moy0Var) {
        super(flowable);
        this.c = biFunction;
        this.d = moy0Var;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(gnc1Var);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.c);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.d.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.b.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }
}
