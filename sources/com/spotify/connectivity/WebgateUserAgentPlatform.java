package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.mkl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/spotify/connectivity/WebgateUserAgentPlatform;", "", "<init>", "()V", "Companion", "p/mkl1", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class WebgateUserAgentPlatform {
    public static final mkl1 Companion = new mkl1();

    public static final native String android();

    public static final native String ios();

    public static final native String linux();

    public static final native String osxArm64();

    public static final native String osxX64();

    public static final native String windowsArm64();

    public static final native String windowsX86();

    public static final native String windowsX86_64();
}
