package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wi6 {
    public final dj6 a;
    public final dj6 b;
    public final dj6 c;
    public final dj6 d;
    public final fj6 e;

    public wi6(dj6 dj6Var, dj6 dj6Var2, dj6 dj6Var3, dj6 dj6Var4, fj6 fj6Var) {
        this.a = dj6Var;
        this.b = dj6Var2;
        this.c = dj6Var3;
        this.d = dj6Var4;
        this.e = fj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi6)) {
            return false;
        }
        wi6 wi6Var = (wi6) obj;
        return u890.j(this.a, wi6Var.a) && u890.j(this.b, wi6Var.b) && u890.j(this.c, wi6Var.c) && u890.j(this.d, wi6Var.d) && u890.j(this.e, wi6Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        fj6 fj6Var = this.e;
        return iHashCode + (fj6Var == null ? 0 : fj6Var.hashCode());
    }
}
