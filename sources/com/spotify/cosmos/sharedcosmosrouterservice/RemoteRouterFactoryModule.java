package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/spotify/cosmos/sharedcosmosrouterservice/RemoteRouterFactoryModule;", "", "<init>", "()V", "provideRemoteRouterFactory", "Lcom/spotify/cosmos/sharedcosmosrouterservice/RemoteRouterFactory;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class RemoteRouterFactoryModule {
    public static final RemoteRouterFactoryModule INSTANCE = new RemoteRouterFactoryModule();

    private RemoteRouterFactoryModule() {
    }

    public final RemoteRouterFactory provideRemoteRouterFactory() {
        return new RemoteRouterFactory();
    }
}
