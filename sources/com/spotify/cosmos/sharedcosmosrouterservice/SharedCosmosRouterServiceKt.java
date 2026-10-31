package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createSharedCosmosRouterService", "Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;", "dependencies", "Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterServiceDependencies;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 2, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class SharedCosmosRouterServiceKt {
    public static final SharedCosmosRouterService createSharedCosmosRouterService(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
        return DaggerSharedCosmosRouterServiceFactoryComponent.factory().create(sharedCosmosRouterServiceDependencies).sharedCosmosRouterService();
    }
}
