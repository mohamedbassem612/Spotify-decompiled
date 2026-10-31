package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p9a0 {
    public final l9a0 a;
    public final x9a0 b;
    public final w9a0 c;
    public final float d;
    public final boolean e;

    public p9a0(l9a0 l9a0Var, x9a0 x9a0Var, w9a0 w9a0Var, float f, boolean z) {
        this.a = l9a0Var;
        this.b = x9a0Var;
        this.c = w9a0Var;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9a0)) {
            return false;
        }
        p9a0 p9a0Var = (p9a0) obj;
        return u890.j(this.a, p9a0Var.a) && u890.j(this.b, p9a0Var.b) && u890.j(this.c, p9a0Var.c) && Float.compare(this.d, p9a0Var.d) == 0 && this.e == p9a0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + x0d.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
