package com.spotify.mobius.rx3;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ms20;
import p.w2h;
import p.xqd0;
import p.y141;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class RxConnectables {

    /* JADX INFO: renamed from: com.spotify.mobius.rx3.RxConnectables$1, reason: invalid class name */
    class AnonymousClass1 implements Connectable<Object, Object> {
        public final /* synthetic */ ObservableTransformer a;

        public AnonymousClass1(ObservableTransformer observableTransformer) {
            this.a = observableTransformer;
        }

        @Override // com.spotify.mobius.Connectable
        public final Connection L(final Consumer consumer) {
            final PublishSubject publishSubject = new PublishSubject();
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            final Disposable disposableSubscribe = publishSubject.compose(this.a).subscribe((io.reactivex.rxjava3.functions.Consumer<? super R>) new io.reactivex.rxjava3.functions.Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.1.1
                @Override // io.reactivex.rxjava3.functions.Consumer
                public final void accept(Object obj) {
                    synchronized (atomicBoolean) {
                        try {
                            if (!atomicBoolean.get()) {
                                consumer.accept(obj);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
            return new Connection<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.1.2
                @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
                public final void accept(Object obj) {
                    publishSubject.onNext(obj);
                }

                @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
                public final void dispose() {
                    synchronized (atomicBoolean) {
                        atomicBoolean.set(true);
                    }
                    disposableSubscribe.dispose();
                }
            };
        }
    }

    public static Connectable a(ObservableTransformer observableTransformer) {
        Preconditions.b(observableTransformer);
        return new DiscardAfterDisposeConnectable(new AnonymousClass1(observableTransformer));
    }

    public static ObservableTransformer b(final xqd0 xqd0Var) {
        return new ObservableTransformer<Object, Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource apply(final Observable observable) {
                return Observable.create(new ObservableOnSubscribe<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1
                    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
                    public final void subscribe(final ObservableEmitter<Object> observableEmitter) {
                        Objects.requireNonNull(observableEmitter);
                        ms20 ms20Var = new ms20(observableEmitter, (byte) 2);
                        final AtomicBoolean atomicBoolean = new AtomicBoolean();
                        final w2h w2hVar = new w2h(xqd0Var, new y141(atomicBoolean, ms20Var));
                        final Disposable disposableSubscribe = observable.subscribe(new io.reactivex.rxjava3.functions.Consumer<Object>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.1
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Object obj) {
                                w2hVar.accept(obj);
                            }
                        }, new io.reactivex.rxjava3.functions.Consumer<Throwable>() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.2
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Object obj) {
                                observableEmitter.onError((Throwable) obj);
                            }
                        }, new Action() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.3
                            @Override // io.reactivex.rxjava3.functions.Action
                            public final void run() {
                                observableEmitter.onComplete();
                            }
                        });
                        observableEmitter.setCancellable(new Cancellable() { // from class: com.spotify.mobius.rx3.RxConnectables.2.1.4
                            @Override // io.reactivex.rxjava3.functions.Cancellable
                            public final void cancel() {
                                synchronized (atomicBoolean) {
                                    atomicBoolean.set(true);
                                }
                                disposableSubscribe.dispose();
                                w2hVar.dispose();
                            }
                        });
                    }
                });
            }
        };
    }
}
