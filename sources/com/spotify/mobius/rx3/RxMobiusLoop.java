package com.spotify.mobius.rx3;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class RxMobiusLoop<E, M, F> implements ObservableTransformer<E, M> {
    public final MobiusLoop.Factory a;
    public final Object b;

    public RxMobiusLoop(MobiusLoop.Factory factory, Object obj) {
        this.a = factory;
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(final Observable observable) {
        return Observable.create(new ObservableOnSubscribe<Object>() { // from class: com.spotify.mobius.rx3.RxMobiusLoop.1
            @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Object> observableEmitter) {
                RxMobiusLoop rxMobiusLoop = RxMobiusLoop.this;
                final MobiusLoop mobiusLoopG = rxMobiusLoop.a.g(rxMobiusLoop.b);
                mobiusLoopG.b(new Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxMobiusLoop.1.1
                    @Override // com.spotify.mobius.functions.Consumer
                    public final void accept(Object obj) {
                        observableEmitter.onNext(obj);
                    }
                });
                final Disposable disposableSubscribe = observable.subscribe(new io.reactivex.rxjava3.functions.Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxMobiusLoop.1.2
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj) {
                        mobiusLoopG.a(obj);
                    }
                }, new io.reactivex.rxjava3.functions.Consumer<Throwable>() { // from class: com.spotify.mobius.rx3.RxMobiusLoop.1.3
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj) {
                        observableEmitter.onError(new UnrecoverableIncomingException((Throwable) obj));
                    }
                });
                observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.mobius.rx3.RxMobiusLoop.1.4
                    @Override // io.reactivex.rxjava3.functions.Cancellable
                    public final void cancel() {
                        mobiusLoopG.dispose();
                        disposableSubscribe.dispose();
                    }
                });
            }
        });
    }
}
