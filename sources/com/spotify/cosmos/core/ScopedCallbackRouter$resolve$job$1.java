package com.spotify.cosmos.core;

import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.a8d1;
import p.eg;
import p.hm5;
import p.l811;
import p.lnm;
import p.p811;
import p.q8r;
import p.rih1;
import p.u890;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@q8r(c = "com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$resolve$job$1", f = "ScopedCallbackRouter.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "state", "Lp/rih1;", "<anonymous>", "(Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;)V"}, k = 3, mv = {2, 3, 0})
public final class ScopedCallbackRouter$resolve$job$1 extends a8d1 implements vu30 {
    final /* synthetic */ ResolveCallback $callback;
    final /* synthetic */ boolean $isIdempotent;
    final /* synthetic */ p811 $lifetime;
    final /* synthetic */ Request $request;
    final /* synthetic */ l811 $shouldSubscribeOnAvailable;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedCallbackRouter$resolve$job$1(l811 l811Var, p811 p811Var, Request request, ResolveCallback resolveCallback, boolean z, lnm<? super ScopedCallbackRouter$resolve$job$1> lnmVar) {
        super(2, lnmVar);
        this.$shouldSubscribeOnAvailable = l811Var;
        this.$lifetime = p811Var;
        this.$request = request;
        this.$callback = resolveCallback;
        this.$isIdempotent = z;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        ScopedCallbackRouter$resolve$job$1 scopedCallbackRouter$resolve$job$1 = new ScopedCallbackRouter$resolve$job$1(this.$shouldSubscribeOnAvailable, this.$lifetime, this.$request, this.$callback, this.$isIdempotent, lnmVar);
        scopedCallbackRouter$resolve$job$1.L$0 = obj;
        return scopedCallbackRouter$resolve$job$1;
    }

    public final Object invoke(ScopedCallbackRouter.RouterState routerState, lnm<? super rih1> lnmVar) {
        return create(routerState, lnmVar).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ScopedCallbackRouter.RouterState routerState = (ScopedCallbackRouter.RouterState) this.L$0;
        if (this.label != 0) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (routerState instanceof ScopedCallbackRouter.RouterState.Available) {
            if (this.$shouldSubscribeOnAvailable.a) {
                Lifetime lifetime = (Lifetime) this.$lifetime.a;
                if (lifetime != null) {
                    lifetime.release();
                }
                this.$lifetime.a = ((ScopedCallbackRouter.RouterState.Available) routerState).getRouter().resolve(this.$request, this.$callback);
                this.$shouldSubscribeOnAvailable.a = this.$isIdempotent;
            }
        } else {
            if (!u890.j(routerState, ScopedCallbackRouter.RouterState.NotAvailable.INSTANCE)) {
                eg.o();
                return null;
            }
            Lifetime lifetime2 = (Lifetime) this.$lifetime.a;
            if (lifetime2 != null) {
                lifetime2.release();
            }
        }
        return rih1.a;
    }
}
