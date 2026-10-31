package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qr70 implements i4i1, cx70, ue90 {
    public static final sy8 b;
    public static final sy8 c;
    public static final sy8 d;
    public static final sy8 e;
    public static final sy8 f;
    public static final sy8 g;
    public static final sy8 h;
    public static final sy8 i;
    public static final sy8 t;
    public final eqq0 a;

    static {
        Class cls = Integer.TYPE;
        b = new sy8("camerax.core.imageCapture.captureMode", cls, null);
        c = new sy8("camerax.core.imageCapture.flashMode", cls, null);
        d = new sy8("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        e = new sy8("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f = new sy8("camerax.core.imageCapture.imageReaderProxyProvider", sy70.class, null);
        g = new sy8("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        h = new sy8("camerax.core.imageCapture.flashType", cls, null);
        i = new sy8("camerax.core.imageCapture.screenFlash", nr70.class, null);
        t = new sy8("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public qr70(eqq0 eqq0Var) {
        this.a = eqq0Var;
    }

    public final qsk l() {
        return this.a;
    }

    @Override // p.st70
    public final int m() {
        return ((Integer) e(st70.K)).intValue();
    }
}
