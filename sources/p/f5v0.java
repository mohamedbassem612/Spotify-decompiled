package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f5v0 {
    public final vu30 a;
    public final yj41 b;
    public final n9f1 c;

    public f5v0(vu30 vu30Var, yj41 yj41Var, n9f1 n9f1Var) {
        this.a = vu30Var;
        this.b = yj41Var;
        this.c = n9f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f5v0) {
            f5v0 f5v0Var = (f5v0) obj;
            return u890.j(this.a, f5v0Var.a) && u890.j(this.b, f5v0Var.b) && this.c == f5v0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
