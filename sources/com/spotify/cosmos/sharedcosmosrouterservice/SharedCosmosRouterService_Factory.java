package com.spotify.cosmos.sharedcosmosrouterservice;

import p.a8n;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SharedCosmosRouterService_Factory implements jly0 {
    private final jly0 coreThreadingApiProvider;
    private final jly0 remoteRouterFactoryProvider;

    private SharedCosmosRouterService_Factory(jly0 jly0Var, jly0 jly0Var2) {
        this.coreThreadingApiProvider = jly0Var;
        this.remoteRouterFactoryProvider = jly0Var2;
    }

    public static SharedCosmosRouterService_Factory create(jly0 jly0Var, jly0 jly0Var2) {
        return new SharedCosmosRouterService_Factory(jly0Var, jly0Var2);
    }

    public static SharedCosmosRouterService newInstance(a8n a8nVar, RemoteRouterFactory remoteRouterFactory) {
        return new SharedCosmosRouterService(a8nVar, remoteRouterFactory);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public SharedCosmosRouterService m1281get() {
        return newInstance((a8n) this.coreThreadingApiProvider.get(), (RemoteRouterFactory) this.remoteRouterFactoryProvider.get());
    }
}
