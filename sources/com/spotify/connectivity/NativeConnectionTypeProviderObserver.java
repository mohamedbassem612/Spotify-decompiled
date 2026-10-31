package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Lcom/spotify/connectivity/NativeConnectionTypeProviderObserver;", "Lcom/spotify/connectivity/ConnectionTypeProvider$Observer;", "<init>", "()V", "Lp/rih1;", "destroy", "Lcom/spotify/connectivity/ConnectionType;", "oldConnectionType", "newConnectionType", "connectionTypeChanged", "(Lcom/spotify/connectivity/ConnectionType;Lcom/spotify/connectivity/ConnectionType;)V", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeConnectionTypeProviderObserver implements ConnectionTypeProvider.Observer {
    private long nThis;

    private NativeConnectionTypeProviderObserver() {
    }

    private final native void destroy();

    private static /* synthetic */ void getNThis$annotations() {
    }

    @Override // com.spotify.connectivity.ConnectionTypeProvider.Observer
    public native void connectionTypeChanged(ConnectionType oldConnectionType, ConnectionType newConnectionType);
}
