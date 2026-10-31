package com.spotify.core.corefull;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.coremediarenderer.bridge.NativeCmrBridge;
import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/spotify/core/corefull/FullAuthenticatedScope;", "", "contentDeliveryIOTransport", "Lcom/spotify/esperanto/esperanto/Transport;", "tokenExchangeTransport", "cmrBridge", "Lcom/spotify/coremediarenderer/bridge/NativeCmrBridge;", "mediaProcessorFactory", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "src_main_java_com_spotify_core_corefull-corefull"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface FullAuthenticatedScope {
    NativeCmrBridge cmrBridge();

    Transport contentDeliveryIOTransport();

    NativeMediaProcessorFactory mediaProcessorFactory();

    Transport tokenExchangeTransport();
}
