package com.spotify.esperanto.esperantocosmos;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/spotify/esperanto/esperantocosmos/EsperantoCallbackRouter;", "", "resolve", "Lcom/spotify/cosmos/cosmos/Lifetime;", "request", "Lcom/spotify/cosmos/cosmos/Request;", "callback", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "src_main_java_com_spotify_esperanto_esperantocosmos-esperantocosmos_kt-api"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface EsperantoCallbackRouter {
    Lifetime resolve(Request request, ResolveCallback callback);
}
