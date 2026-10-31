package com.spotify.cosmos.core;

import io.reactivex.rxjava3.core.ObservableEmitter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ScopedRouter$routerState$1$disposable$2 extends hab0 implements Function0 {
    final /* synthetic */ ObservableEmitter<ScopedRouter.RouterState> $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedRouter$routerState$1$disposable$2(ObservableEmitter<ScopedRouter.RouterState> observableEmitter) {
        super(0);
        this.$emitter = observableEmitter;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m18invoke() {
        this.$emitter.onNext(ScopedRouter.RouterState.NotAvailable.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m18invoke();
        return rih1.a;
    }
}
