package p;

import android.util.Range;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface i4i1 extends jrd1, st70 {
    public static final sy8 A0 = new sy8("camerax.core.useCase.defaultSessionConfig", bb61.class, null);
    public static final sy8 B0 = new sy8("camerax.core.useCase.defaultCaptureConfig", wnd.class, null);
    public static final sy8 C0 = new sy8("camerax.core.useCase.sessionConfigUnpacker", a2d.class, null);
    public static final sy8 D0 = new sy8("camerax.core.useCase.captureConfigUnpacker", v1d.class, null);
    public static final sy8 E0;
    public static final sy8 F0;
    public static final sy8 G0;
    public static final sy8 H0;
    public static final sy8 I0;
    public static final sy8 J0;
    public static final sy8 K0;

    static {
        Class cls = Integer.TYPE;
        E0 = new sy8("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        F0 = new sy8("camerax.core.useCase.targetFrameRate", Range.class, null);
        Class cls2 = Boolean.TYPE;
        G0 = new sy8("camerax.core.useCase.zslDisabled", cls2, null);
        H0 = new sy8("camerax.core.useCase.highResolutionDisabled", cls2, null);
        I0 = new sy8("camerax.core.useCase.captureType", k4i1.class, null);
        J0 = new sy8("camerax.core.useCase.previewStabilizationMode", cls, null);
        K0 = new sy8("camerax.core.useCase.videoStabilizationMode", cls, null);
    }

    default int t() {
        return ((Integer) h(J0, 0)).intValue();
    }

    default k4i1 x() {
        return (k4i1) e(I0);
    }
}
