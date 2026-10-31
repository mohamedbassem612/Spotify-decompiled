package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import kotlin.Metadata;
import p.a8n;
import p.emn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/spotify/cosmos/sharedcosmosrouterservice/LegacySharedCosmosRouterServiceModule;", "", "<init>", "()V", "Lp/emn0;", "nativeLibrary", "Lp/a8n;", "coreThreadingApi", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "remoteNativeRouter", "Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;", "provideSharedCosmosRouterService", "(Lp/emn0;Lp/a8n;Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;)Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;", "sharedCosmosRouterService", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "provideSharedCosmosRouterApi", "(Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;)Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LegacySharedCosmosRouterServiceModule {
    public static final LegacySharedCosmosRouterServiceModule INSTANCE = new LegacySharedCosmosRouterServiceModule();

    private LegacySharedCosmosRouterServiceModule() {
    }

    public final SharedCosmosRouterApi provideSharedCosmosRouterApi(SharedCosmosRouterService sharedCosmosRouterService) {
        return sharedCosmosRouterService.getApi();
    }

    public final SharedCosmosRouterService provideSharedCosmosRouterService(emn0 nativeLibrary, a8n coreThreadingApi, RemoteNativeRouter remoteNativeRouter) {
        nativeLibrary.a();
        return new SharedCosmosRouterService(coreThreadingApi, remoteNativeRouter);
    }
}
