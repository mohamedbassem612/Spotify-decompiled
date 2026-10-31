package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mhc0 {
    public static final int b = ila0.C(1, 3, 1);
    public static final int c = ila0.C(3, 2, 2);
    public static final int d = ila0.C(2, 4, 1);
    public final int a;

    public static String a(int i) {
        return l1d.n(kuo1.n((i >> 16) & 255), ")", gvg.n("LineBreak(strategy=", fuo1.C(i & 255), ", strictness=", guo1.K((i >> 8) & 255), ", wordBreak="));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mhc0) {
            return this.a == ((mhc0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
