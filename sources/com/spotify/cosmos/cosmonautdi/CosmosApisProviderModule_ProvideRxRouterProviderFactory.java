package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CosmosApisProviderModule_ProvideRxRouterProviderFactory implements jly0 {
    private final jly0 componentProvider;

    private CosmosApisProviderModule_ProvideRxRouterProviderFactory(jly0 jly0Var) {
        this.componentProvider = jly0Var;
    }

    public static CosmosApisProviderModule_ProvideRxRouterProviderFactory create(jly0 jly0Var) {
        return new CosmosApisProviderModule_ProvideRxRouterProviderFactory(jly0Var);
    }

    public static RxRouterProvider provideRxRouterProvider(CosmosComponentApi cosmosComponentApi) {
        RxRouterProvider rxRouterProviderProvideRxRouterProvider = CosmosApisProviderModule.INSTANCE.provideRxRouterProvider(cosmosComponentApi);
        c8o.m(rxRouterProviderProvideRxRouterProvider);
        return rxRouterProviderProvideRxRouterProvider;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public RxRouterProvider m10get() {
        return provideRxRouterProvider((CosmosComponentApi) this.componentProvider.get());
    }
}
