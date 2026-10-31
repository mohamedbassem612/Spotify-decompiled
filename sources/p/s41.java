package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s41 extends c51 {
    public final w01 a;
    public final boolean b;
    public final n5o c;

    public s41(w01 w01Var, boolean z, n5o n5oVar) {
        this.a = w01Var;
        this.b = z;
        this.c = n5oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s41)) {
            return false;
        }
        s41 s41Var = (s41) obj;
        return u890.j(this.a, s41Var.a) && this.b == s41Var.b && u890.j(this.c, s41Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        n5o n5oVar = this.c;
        return iG + (n5oVar == null ? 0 : n5oVar.hashCode());
    }
}
