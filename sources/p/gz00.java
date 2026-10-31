package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gz00 implements z190 {
    public static final gz00 b = new gz00(0);
    public static final gz00 c = new gz00(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ gz00(byte b2) {
        this.a = b2;
    }

    public final boolean isInRange(int i) {
        switch (this.a) {
            case 0:
                return hz00.b(i) != null;
            default:
                return s2q0.a(i) != null;
        }
    }
}
