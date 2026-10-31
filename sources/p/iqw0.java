package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iqw0 implements rfd {
    public static final iqw0 b = new iqw0(0);
    public static final iqw0 c = new iqw0(1);
    public static final iqw0 d = new iqw0(2);
    public static final iqw0 e = new iqw0(3);
    public static final iqw0 f = new iqw0(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ iqw0(byte b2) {
        this.a = b2;
    }

    public final Object a(hqw0 hqw0Var, qo90 qo90Var, ais aisVar) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(hqw0Var.a);
            case 1:
                l0l l0lVar = hqw0Var.c;
                return Boolean.valueOf(l0lVar == null || hqq0.c0(l0lVar));
            case 2:
                return Boolean.valueOf(!hqw0Var.d.isPlaying() || hqw0Var.d.isPaused());
            case 3:
                return Boolean.valueOf(hqw0Var.b == null);
            default:
                return Boolean.valueOf(qo90Var.i.b);
        }
    }
}
