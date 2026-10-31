package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fgc0 {
    public static final a1i d = new a1i(f7c0.Z, f7c0.N0);
    public final ir61 a;
    public final boolean b;
    public final int c;

    public fgc0(ir61 ir61Var, boolean z, int i) {
        this.a = ir61Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgc0)) {
            return false;
        }
        fgc0 fgc0Var = (fgc0) obj;
        return u890.j(this.a, fgc0Var.a) && this.b == fgc0Var.b && this.c == fgc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
