package com.spotify.cosmos.core;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;
import p.ssw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "router", "Lp/rih1;", "invoke", "(Lcom/spotify/cosmos/callbackrouter/CallbackRouter;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class ScopedCallbackRouter$routerState$1$scopeDisposable$1 extends hab0 implements iu30 {
    final /* synthetic */ ssw0 $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedCallbackRouter$routerState$1$scopeDisposable$1(ssw0 ssw0Var) {
        super(1);
        this.$$this$callbackFlow = ssw0Var;
    }

    public final void invoke(CallbackRouter callbackRouter) {
        this.$$this$callbackFlow.l(new ScopedCallbackRouter.RouterState.Available(callbackRouter));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CallbackRouter) obj);
        return rih1.a;
    }
}
