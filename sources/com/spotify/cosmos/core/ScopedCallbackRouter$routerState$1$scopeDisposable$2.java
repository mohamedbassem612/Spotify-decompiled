package com.spotify.cosmos.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;
import p.ssw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ScopedCallbackRouter$routerState$1$scopeDisposable$2 extends hab0 implements Function0 {
    final /* synthetic */ ssw0 $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedCallbackRouter$routerState$1$scopeDisposable$2(ssw0 ssw0Var) {
        super(0);
        this.$$this$callbackFlow = ssw0Var;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m17invoke() {
        this.$$this$callbackFlow.l(ScopedCallbackRouter.RouterState.NotAvailable.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m17invoke();
        return rih1.a;
    }
}
