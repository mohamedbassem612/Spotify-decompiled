package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import p.c8o;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterApiFactory implements jly0 {
    private final jly0 sharedCosmosRouterServiceProvider;

    private LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterApiFactory(jly0 jly0Var) {
        this.sharedCosmosRouterServiceProvider = jly0Var;
    }

    public static LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterApiFactory create(jly0 jly0Var) {
        return new LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterApiFactory(jly0Var);
    }

    public static SharedCosmosRouterApi provideSharedCosmosRouterApi(SharedCosmosRouterService sharedCosmosRouterService) {
        SharedCosmosRouterApi sharedCosmosRouterApiProvideSharedCosmosRouterApi = LegacySharedCosmosRouterServiceModule.INSTANCE.provideSharedCosmosRouterApi(sharedCosmosRouterService);
        c8o.m(sharedCosmosRouterApiProvideSharedCosmosRouterApi);
        return sharedCosmosRouterApiProvideSharedCosmosRouterApi;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public SharedCosmosRouterApi m1279get() {
        return provideSharedCosmosRouterApi((SharedCosmosRouterService) this.sharedCosmosRouterServiceProvider.get());
    }
}
