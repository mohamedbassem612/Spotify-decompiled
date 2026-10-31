package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lit0 {
    public final boolean a;
    public final boolean b;
    public final kit0 c;
    public final git0 d;
    public final jit0 e;

    public lit0(boolean z, boolean z2, kit0 kit0Var, git0 git0Var, jit0 jit0Var) {
        this.a = z;
        this.b = z2;
        this.c = kit0Var;
        this.d = git0Var;
        this.e = jit0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lit0)) {
            return false;
        }
        lit0 lit0Var = (lit0) obj;
        return this.a == lit0Var.a && this.b == lit0Var.b && this.c == lit0Var.c && this.d.equals(lit0Var.d) && u890.j(this.e, lit0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }
}
