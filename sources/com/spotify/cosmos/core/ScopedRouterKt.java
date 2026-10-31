package com.spotify.cosmos.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isSuccessful", "", "Lcom/spotify/cosmos/cosmos/Response;", "(Lcom/spotify/cosmos/cosmos/Response;)Z", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 2, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class ScopedRouterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSuccessful(Response response) {
        int status = response.getStatus();
        return 200 <= status && status < 300;
    }
}
