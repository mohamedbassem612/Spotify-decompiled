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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
        @Override // p.gnc1
        public final void onComplete() {
            ((FlowableRepeatWhen$WhenReceiver) this.X).cancel();
            this.i.onComplete();
        }
    }

    public FlowableRetryWhen(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(gnc1Var);
        ObjectHelper.a(8, "capacityHint");
        FlowableProcessor flowableProcessorD0 = new UnicastProcessor(8).d0();
        try {
            Object objApply = this.c.apply(flowableProcessorD0);
            Objects.requireNonNull(objApply, "handler returned a null Publisher");
            moy0 moy0Var = (moy0) objApply;
            FlowableRepeatWhen$WhenReceiver flowableRepeatWhen$WhenReceiver = new FlowableRepeatWhen$WhenReceiver(this.b);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, flowableProcessorD0, flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.d = retryWhenSubscriber;
            gnc1Var.onSubscribe(retryWhenSubscriber);
            moy0Var.subscribe(flowableRepeatWhen$WhenReceiver);
            flowableRepeatWhen$WhenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
