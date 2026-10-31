package com.spotify.cosmos.rxrouter;

import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory implements jly0 {
    private final jly0 rxRouterProvider;

    private RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory(jly0 jly0Var) {
        this.rxRouterProvider = jly0Var;
    }

    public static RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory create(jly0 jly0Var) {
        return new RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory(jly0Var);
    }

    public static RxRouterProvider provideRxRouterProvider(RxRouter rxRouter) {
        RxRouterProvider rxRouterProviderProvideRxRouterProvider = RxRouterProviderModule.INSTANCE.provideRxRouterProvider(rxRouter);
        c8o.m(rxRouterProviderProvideRxRouterProvider);
        return rxRouterProviderProvideRxRouterProvider;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RxRouterProvider m12get() {
        return provideRxRouterProvider((RxRouter) this.rxRouterProvider.get());
    }
}
