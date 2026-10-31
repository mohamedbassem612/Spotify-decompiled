package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gv21 {
    public static final gv21 e = new gv21(false, false, false, false);
    public static final gv21 f = new gv21(true, true, true, true);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gv21(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv21)) {
            return false;
        }
        gv21 gv21Var = (gv21) obj;
        return this.a == gv21Var.a && this.b == gv21Var.b && this.c == gv21Var.c && this.d == gv21Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
