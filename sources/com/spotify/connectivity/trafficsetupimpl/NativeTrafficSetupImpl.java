package com.spotify.connectivity.trafficsetupimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.connectivity.trafficsetup.NativeTrafficSetup;
import com.spotify.esperanto.esperanto.CoroutineTransport;
import kotlin.Metadata;
import p.wmn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u00020\f8Æ\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/spotify/connectivity/trafficsetupimpl/NativeTrafficSetupImpl;", "Lcom/spotify/connectivity/trafficsetup/NativeTrafficSetup;", "<init>", "()V", "Lp/rih1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "coroutineTransport", "Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "getCoroutineTransport", "()Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "Companion", "p/wmn0", "src_main_java_com_spotify_connectivity_trafficsetupimpl-trafficsetupimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeTrafficSetupImpl implements NativeTrafficSetup {
    public static final wmn0 Companion = new wmn0();
    private final CoroutineTransport coroutineTransport;
    private long nThis;

    public static final native NativeTrafficSetupImpl create();

    @Override // com.spotify.connectivity.trafficsetup.NativeTrafficSetup
    public native void destroy();

    public final native CoroutineTransport getCoroutineTransport();

    @Override // com.spotify.connectivity.trafficsetup.NativeTrafficSetup
    public long getNThis() {
        return this.nThis;
    }
}
