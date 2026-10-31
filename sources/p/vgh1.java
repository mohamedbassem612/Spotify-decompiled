package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vgh1 extends bfs0 {
    public static final vgh1 c = new vgh1(0, 1000.0f);
    public static final vgh1 d = new vgh1(1, 900.0f);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgh1(byte b, float f) {
        super(f);
        this.b = b;
    }

    public final float a(int i) {
        switch (this.b) {
            case 0:
                int iC = l1d.C(i);
                return (iC == 0 || iC == 1) ? 225.0f : 264.0f;
            default:
                int iC2 = l1d.C(i);
                return (iC2 == 0 || iC2 == 1) ? 225.0f : 264.0f;
        }
    }

    public final float b(int i) {
        switch (this.b) {
            case 0:
                return ugh1.a[l1d.C(i)] == 1 ? 1200.0f : 600.0f;
            default:
                return 600.0f;
        }
    }
}
