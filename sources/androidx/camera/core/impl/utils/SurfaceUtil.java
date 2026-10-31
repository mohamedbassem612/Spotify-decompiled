package androidx.camera.core.impl.utils;

import android.view.Surface;
import p.nhc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static nhc a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        nhc nhcVar = new nhc((byte) 26);
        int i = iArrNativeGetSurfaceInfo[0];
        int i2 = iArrNativeGetSurfaceInfo[1];
        int i3 = iArrNativeGetSurfaceInfo[2];
        return nhcVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
