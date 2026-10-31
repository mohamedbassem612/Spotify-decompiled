package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class b implements Function {
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        final ObservableTransformer observableTransformer = (ObservableTransformer) obj;
        return new Consumer<Throwable>() { // from class: com.spotify.mobius.rx3.RxMobius.SubtypeEffectHandlerBuilder.2
            public AnonymousClass2() {
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(Object obj2) {
                RxJavaPlugins.b(EffectHandlerException.a(observableTransformer, (Throwable) obj2));
            }
        };
    }
}
