package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        public final Function e;

        public OnErrorReturnSubscriber(gnc1 gnc1Var, Function function) {
            super(gnc1Var);
            this.e = function;
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            try {
                Object objApply = this.e.apply(th);
                Objects.requireNonNull(objApply, "The valueSupplier returned a null value");
                a(objApply);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                this.a.onError(new CompositeException(th, th2));
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.d++;
            this.a.onNext(obj);
        }
    }

    public FlowableOnErrorReturn(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new OnErrorReturnSubscriber(gnc1Var, this.c));
    }
}
