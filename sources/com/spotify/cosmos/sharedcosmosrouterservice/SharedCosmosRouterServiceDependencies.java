package com.spotify.cosmos.sharedcosmosrouterservice;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.a8n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterServiceDependencies;", "", "Lp/a8n;", "coreThreadingApi", "<init>", "(Lp/a8n;)V", "Lp/a8n;", "getCoreThreadingApi", "()Lp/a8n;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class SharedCosmosRouterServiceDependencies {
    private final a8n coreThreadingApi;

    public SharedCosmosRouterServiceDependencies(a8n a8nVar) {
        this.coreThreadingApi = a8nVar;
    }

    public final a8n getCoreThreadingApi() {
        return this.coreThreadingApi;
    }
}
