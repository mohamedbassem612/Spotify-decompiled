package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nus0 {
    public final ioj0 a;
    public final boolean b;
    public final boolean c;

    public nus0(ioj0 ioj0Var, boolean z, boolean z2) {
        this.a = ioj0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nus0)) {
            return false;
        }
        nus0 nus0Var = (nus0) obj;
        return u890.j(this.a, nus0Var.a) && this.b == nus0Var.b && this.c == nus0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.a.hashCode() * 31, 31, this.b);
    }
}
