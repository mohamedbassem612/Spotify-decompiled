package p;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface cx70 extends wb01 {
    public static final sy8 M = new sy8("camerax.core.imageOutput.targetAspectRatio", z47.class, null);
    public static final sy8 N;
    public static final sy8 O;
    public static final sy8 P;
    public static final sy8 Q;
    public static final sy8 R;
    public static final sy8 S;
    public static final sy8 T;
    public static final sy8 U;
    public static final sy8 V;

    static {
        Class cls = Integer.TYPE;
        N = new sy8("camerax.core.imageOutput.targetRotation", cls, null);
        O = new sy8("camerax.core.imageOutput.appTargetRotation", cls, null);
        P = new sy8("camerax.core.imageOutput.mirrorMode", cls, null);
        Q = new sy8("camerax.core.imageOutput.targetResolution", Size.class, null);
        R = new sy8("camerax.core.imageOutput.defaultResolution", Size.class, null);
        S = new sy8("camerax.core.imageOutput.maxResolution", Size.class, null);
        T = new sy8("camerax.core.imageOutput.supportedResolutions", List.class, null);
        U = new sy8("camerax.core.imageOutput.resolutionSelector", ft21.class, null);
        V = new sy8("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void C(cx70 cx70Var) {
        boolean zG = cx70Var.g(M);
        boolean z = ((Size) cx70Var.h(Q, (Object) null)) != null;
        if (zG && z) {
            hhg1.n("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((ft21) cx70Var.h(U, (Object) null)) != null) {
            if (zG || z) {
                hhg1.n("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int p() {
        return ((Integer) h(N, 0)).intValue();
    }
}
