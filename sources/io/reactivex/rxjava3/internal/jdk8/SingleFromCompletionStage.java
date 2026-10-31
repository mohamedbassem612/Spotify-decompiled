package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFromCompletionStage<T> extends Single<T> {
    public final CompletionStage a;

    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {
        public final SingleObserver a;
        public final FlowableFromCompletionStage$BiConsumerAtomicReference b;

        public CompletionStageHandler(SingleObserver singleObserver, FlowableFromCompletionStage$BiConsumerAtomicReference flowableFromCompletionStage$BiConsumerAtomicReference) {
            this.a = singleObserver;
            this.b = flowableFromCompletionStage$BiConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            SingleObserver singleObserver = this.a;
            if (th2 != null) {
                singleObserver.onError(th2);
            } else if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        public void dispose() {
            this.b.set(null);
        }

        public boolean isDisposed() {
            return this.b.get() == null;
        }
    }

    public SingleFromCompletionStage(CompletionStage completionStage) {
        this.a = completionStage;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        FlowableFromCompletionStage$BiConsumerAtomicReference flowableFromCompletionStage$BiConsumerAtomicReference = new FlowableFromCompletionStage$BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(singleObserver, flowableFromCompletionStage$BiConsumerAtomicReference);
        flowableFromCompletionStage$BiConsumerAtomicReference.lazySet(completionStageHandler);
        singleObserver.onSubscribe(completionStageHandler);
        this.a.whenComplete(flowableFromCompletionStage$BiConsumerAtomicReference);
    }
}
