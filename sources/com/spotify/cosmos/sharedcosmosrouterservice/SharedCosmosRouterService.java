package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.core.RemoteNativeRouter;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.scheduling.CoreThreadCosmosScheduler;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import kotlin.Metadata;
import p.a8n;
import p.d8n;
import p.f961;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u0019\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "Lp/f961;", "Lp/a8n;", "coreThreadingApi", "Lcom/spotify/cosmos/sharedcosmosrouterservice/RemoteRouterFactory;", "remoteRouterFactory", "<init>", "(Lp/a8n;Lcom/spotify/cosmos/sharedcosmosrouterservice/RemoteRouterFactory;)V", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "remoteNativeRouter", "(Lp/a8n;Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;)V", "Lp/rih1;", "shutdown", "()V", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "getRemoteNativeRouter", "()Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "nativeRouter", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "getNativeRouter", "()Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "getApi", "()Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "api", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class SharedCosmosRouterService implements SharedCosmosRouterApi, f961 {
    private final NativeRouter nativeRouter;
    private final RemoteNativeRouter remoteNativeRouter;

    public SharedCosmosRouterService(a8n a8nVar, RemoteNativeRouter remoteNativeRouter) {
        this.remoteNativeRouter = remoteNativeRouter;
        this.nativeRouter = (NativeRouter) remoteNativeRouter.getNativeRouter();
        getNativeRouter().initializeScheduling(new CoreThreadCosmosScheduler(((d8n) a8nVar).c));
    }

    @Override // com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi
    public NativeRouter getNativeRouter() {
        return this.nativeRouter;
    }

    @Override // com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi
    public RemoteNativeRouter getRemoteNativeRouter() {
        return this.remoteNativeRouter;
    }

    public void shutdown() {
        getNativeRouter().deinitializeScheduling();
        getRemoteNativeRouter().destroy();
    }

    /* JADX INFO: renamed from: getApi, reason: merged with bridge method [inline-methods] */
    public SharedCosmosRouterApi m21getApi() {
        return this;
    }

    public SharedCosmosRouterService(a8n a8nVar, RemoteRouterFactory remoteRouterFactory) {
        this(a8nVar, remoteRouterFactory.createRemoteNativeRouter());
    }
}
