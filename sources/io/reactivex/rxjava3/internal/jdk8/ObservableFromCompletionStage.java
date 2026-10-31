package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableFromCompletionStage<T> extends Observable<T> {
    public final CompletionStage a;

    public static final class BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(obj, th2);
            }
        }
    }

    public static final class CompletionStageHandler<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {
        public final BiConsumerAtomicReference c;

        public CompletionStageHandler(Observer observer, BiConsumerAtomicReference biConsumerAtomicReference) {
            super(observer);
            this.c = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            Observer observer = ((DeferredScalarDisposable) this).a;
            if (th2 != null) {
                observer.onError(th2);
            } else if (obj != null) {
                b(obj);
            } else {
                observer.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        public void dispose() {
            super.dispose();
            this.c.set(null);
        }
    }

    public ObservableFromCompletionStage(CompletionStage completionStage) {
        this.a = completionStage;
    }

    public final void subscribeActual(Observer observer) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(observer, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        observer.onSubscribe(completionStageHandler);
        this.a.whenComplete(biConsumerAtomicReference);
    }
}
