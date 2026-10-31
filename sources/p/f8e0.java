package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f8e0 {
    public final wsc0 a;
    public final boolean b;
    public final ibk0 c;
    public final boolean d;

    public f8e0(wsc0 wsc0Var, boolean z, ibk0 ibk0Var, boolean z2) {
        this.a = wsc0Var;
        this.b = z;
        this.c = ibk0Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8e0)) {
            return false;
        }
        f8e0 f8e0Var = (f8e0) obj;
        return u890.j(this.a, f8e0Var.a) && this.b == f8e0Var.b && u890.j(this.c, f8e0Var.c) && this.d == f8e0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
