package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r8x0 extends w361 {
    public final String c;
    public final int d;
    public final nbx0 e;

    public r8x0(String str, int i, nbx0 nbx0Var) {
        this.c = str;
        this.d = i;
        this.e = nbx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8x0)) {
            return false;
        }
        r8x0 r8x0Var = (r8x0) obj;
        return u890.j(this.c, r8x0Var.c) && this.d == r8x0Var.d && u890.j(this.e, r8x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, this.c.hashCode() * 31, 31);
    }
}
