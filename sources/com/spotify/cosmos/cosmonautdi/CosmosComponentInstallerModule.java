package com.spotify.cosmos.cosmonautdi;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosComponentInstallerModule;", "", "<init>", "()V", "cosmosComponent", "Lcom/spotify/cosmos/cosmoscomponentapi/CosmosComponentApi;", "deps", "Lcom/spotify/cosmos/cosmonautdi/CosmosDeps;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CosmosComponentInstallerModule {
    public static final CosmosComponentInstallerModule INSTANCE = new CosmosComponentInstallerModule();

    private CosmosComponentInstallerModule() {
    }

    public final CosmosComponentApi cosmosComponent(CosmosDeps deps) {
        return DaggerCosmosComponent.factory().create(deps);
    }
}
