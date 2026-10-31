package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
class Transformers$2 implements ObservableTransformer<Object, Object> {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ Scheduler b;

    public Transformers$2(Consumer consumer, Scheduler scheduler) {
        this.a = consumer;
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMapCompletable(new Function<Object, CompletableSource>() { // from class: com.spotify.mobius.rx3.Transformers$2.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final Object apply(final Object obj) {
                CompletableFromAction completableFromAction = new CompletableFromAction(new Action() { // from class: com.spotify.mobius.rx3.Transformers.2.1.1
                    @Override // io.reactivex.rxjava3.functions.Action
                    public final void run() {
                        Transformers$2.this.a.accept(obj);
                    }
                });
                Scheduler scheduler = Transformers$2.this.b;
                return scheduler == null ? completableFromAction : completableFromAction.s(scheduler);
            }
        }).w();
    }
}
