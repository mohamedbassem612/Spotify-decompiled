package com.spotify.cosmos.rxrouter;

import p.c8o;
import p.dg30;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class RxRouterActivityModule_Companion_ProvideRouterFactory implements jly0 {
    private final jly0 activityProvider;
    private final jly0 providerProvider;

    private RxRouterActivityModule_Companion_ProvideRouterFactory(jly0 jly0Var, jly0 jly0Var2) {
        this.providerProvider = jly0Var;
        this.activityProvider = jly0Var2;
    }

    public static RxRouterActivityModule_Companion_ProvideRouterFactory create(jly0 jly0Var, jly0 jly0Var2) {
        return new RxRouterActivityModule_Companion_ProvideRouterFactory(jly0Var, jly0Var2);
    }

    public static RxRouter provideRouter(RxRouterProvider rxRouterProvider, dg30 dg30Var) {
        RxRouter rxRouterProvideRouter = RxRouterActivityModule.INSTANCE.provideRouter(rxRouterProvider, dg30Var);
        c8o.m(rxRouterProvideRouter);
        return rxRouterProvideRouter;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RxRouter m1275get() {
        return provideRouter((RxRouterProvider) this.providerProvider.get(), (dg30) this.activityProvider.get());
    }
}
