package com.spotify.connectivity.connectivitysdkpolicyimpl;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import kotlin.Metadata;
import p.npr;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/spotify/connectivity/connectivitysdkpolicyimpl/DefaultConnectivityPolicyProvider;", "", "<init>", "()V", "Companion", "p/npr", "src_main_java_com_spotify_connectivity_connectivitysdkpolicyimpl-connectivitysdkpolicyimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class DefaultConnectivityPolicyProvider {
    public static final npr Companion = new npr();

    public static final native NativeConnectivityPolicyProvider create(NativeConnectivityManager nativeConnectivityManager);
}
