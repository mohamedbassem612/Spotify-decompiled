package com.spotify.mobius.rx3;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class c implements ObservableTransformer {
    public final /* synthetic */ RxMobius.SubtypeEffectHandlerBuilder a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ ObservableTransformer c;

    public /* synthetic */ c(RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilder, Class cls, ObservableTransformer observableTransformer) {
        this.a = subtypeEffectHandlerBuilder;
        this.b = cls;
        this.c = observableTransformer;
    }

    public final ObservableSource apply(Observable observable) {
        Observable observableOfType = observable.ofType(this.b);
        ObservableTransformer observableTransformer = this.c;
        Observable observableCompose = observableOfType.compose(observableTransformer);
        this.a.b.getClass();
        return observableCompose.doOnError(new RxMobius.SubtypeEffectHandlerBuilder.2(observableTransformer));
    }
}
