package com.spotify.cosmos.cosmonaut;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.rxrouter.RxRouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "", "provideCosmonaut", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "rxRouter", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface CosmonautFactory {
    Cosmonaut provideCosmonaut(RxRouter rxRouter);
}
