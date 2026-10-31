package p;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sr70 {
    public static void a(int i, fp8 fp8Var) {
        if (((ImageCapturePixelHDRPlusQuirk) vvt.a.m(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i == 0) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
            Boolean bool = Boolean.TRUE;
            ((xdn0) fp8Var.b).r(z1d.J(key), bool);
            return;
        }
        if (i != 1) {
            return;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
        Boolean bool2 = Boolean.FALSE;
        ((xdn0) fp8Var.b).r(z1d.J(key2), bool2);
    }
}
