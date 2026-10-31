package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i0g1 {
    public static final i0g1 d = new i0g1(new l6w0());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        String str = zoi1.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public i0g1(l6w0 l6w0Var) {
        this.a = l6w0Var.a;
        this.b = l6w0Var.b;
        this.c = l6w0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0g1.class == obj.getClass()) {
            i0g1 i0g1Var = (i0g1) obj;
            if (this.a == i0g1Var.a && this.b == i0g1Var.b && this.c == i0g1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
