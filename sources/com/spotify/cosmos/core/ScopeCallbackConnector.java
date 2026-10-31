package com.spotify.cosmos.core;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.gn41;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;", "", "Lkotlin/Function1;", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "Lp/rih1;", "onAvailable", "Lkotlin/Function0;", "onBecomeUnavailable", "Lp/gn41;", "connect", "(Lp/iu30;Lkotlin/jvm/functions/Function0;)Lp/gn41;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface ScopeCallbackConnector {
    gn41 connect(iu30 onAvailable, Function0 onBecomeUnavailable);
}
