package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import p.a8n;
import p.bhn0;
import p.c8o;
import p.emn0;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterServiceFactory implements jly0 {
    private final jly0 coreThreadingApiProvider;
    private final jly0 nativeLibraryProvider;
    private final jly0 remoteNativeRouterProvider;

    private LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterServiceFactory(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        this.nativeLibraryProvider = jly0Var;
        this.coreThreadingApiProvider = jly0Var2;
        this.remoteNativeRouterProvider = jly0Var3;
    }

    public static LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterServiceFactory create(jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3) {
        return new LegacySharedCosmosRouterServiceModule_ProvideSharedCosmosRouterServiceFactory(jly0Var, jly0Var2, jly0Var3);
    }

    public static SharedCosmosRouterService provideSharedCosmosRouterService(emn0 emn0Var, a8n a8nVar, RemoteNativeRouter remoteNativeRouter) {
        SharedCosmosRouterService sharedCosmosRouterServiceProvideSharedCosmosRouterService = LegacySharedCosmosRouterServiceModule.INSTANCE.provideSharedCosmosRouterService(emn0Var, a8nVar, remoteNativeRouter);
        c8o.m(sharedCosmosRouterServiceProvideSharedCosmosRouterService);
        return sharedCosmosRouterServiceProvideSharedCosmosRouterService;
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public SharedCosmosRouterService m1280get() {
        if (this.nativeLibraryProvider.get() == null) {
            return provideSharedCosmosRouterService(null, (a8n) this.coreThreadingApiProvider.get(), (RemoteNativeRouter) this.remoteNativeRouterProvider.get());
        }
        bhn0.d();
        return null;
    }
}
