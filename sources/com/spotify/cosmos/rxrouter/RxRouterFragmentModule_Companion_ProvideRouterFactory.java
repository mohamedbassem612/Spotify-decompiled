package com.spotify.cosmos.rxrouter;

import p.c8o;
import p.jly0;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RxRouterFragmentModule_Companion_ProvideRouterFactory implements jly0 {
    private final jly0 fragmentProvider;
    private final jly0 providerProvider;

    private RxRouterFragmentModule_Companion_ProvideRouterFactory(jly0 jly0Var, jly0 jly0Var2) {
        this.providerProvider = jly0Var;
        this.fragmentProvider = jly0Var2;
    }

    public static RxRouterFragmentModule_Companion_ProvideRouterFactory create(jly0 jly0Var, jly0 jly0Var2) {
        return new RxRouterFragmentModule_Companion_ProvideRouterFactory(jly0Var, jly0Var2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, zf30 zf30Var) {
        RxRouter rxRouterProvideRouter = RxRouterFragmentModule.INSTANCE.provideRouter(rxRouterProvider, zf30Var);
        c8o.m(rxRouterProvideRouter);
        return rxRouterProvideRouter;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RxRouter m1276get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (zf30) this.fragmentProvider.get());
    }
}
