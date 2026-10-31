package com.spotify.esperanto.esperantocosmos;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/spotify/esperanto/esperantocosmos/EsperantoRxRouter;", "", "resolve", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/spotify/cosmos/cosmos/Response;", "request", "Lcom/spotify/cosmos/cosmos/Request;", "src_main_java_com_spotify_esperanto_esperantocosmos-esperantocosmos_kt-api"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface EsperantoRxRouter {
    Observable<Response> resolve(Request request);
}
