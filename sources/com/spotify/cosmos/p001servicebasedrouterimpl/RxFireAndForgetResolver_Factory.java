package com.spotify.cosmos.p001servicebasedrouterimpl;

import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RxFireAndForgetResolver_Factory implements jly0 {
    private final jly0 rxRouterProvider;

    private RxFireAndForgetResolver_Factory(jly0 jly0Var) {
        this.rxRouterProvider = jly0Var;
    }

    public static RxFireAndForgetResolver_Factory create(jly0 jly0Var) {
        return new RxFireAndForgetResolver_Factory(jly0Var);
    }

    public static RxFireAndForgetResolver newInstance(RxRouter rxRouter) {
        return new RxFireAndForgetResolver(rxRouter);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RxFireAndForgetResolver m1278get() {
        return newInstance((RxRouter) this.rxRouterProvider.get());
    }
}
