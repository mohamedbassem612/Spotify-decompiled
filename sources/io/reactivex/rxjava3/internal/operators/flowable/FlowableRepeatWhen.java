package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import p.gnc1;
import p.moy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        public final void onComplete() {
            g(0);
        }

        public final void onError(Throwable th) {
            ((WhenSourceSubscriber) this).X.cancel();
            ((WhenSourceSubscriber) this).i.onError(th);
        }
    }

    public FlowableRepeatWhen(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(gnc1Var);
        ObjectHelper.a(8, "capacityHint");
        FlowableProcessor flowableProcessorD0 = new UnicastProcessor(8).d0();
        try {
            Object objApply = this.c.apply(flowableProcessorD0);
            Objects.requireNonNull(objApply, "handler returned a null Publisher");
            moy0 moy0Var = (moy0) objApply;
            WhenReceiver whenReceiver = new WhenReceiver(((AbstractFlowableWithUpstream) this).b);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, flowableProcessorD0, whenReceiver);
            whenReceiver.d = repeatWhenSubscriber;
            gnc1Var.onSubscribe(repeatWhenSubscriber);
            moy0Var.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
