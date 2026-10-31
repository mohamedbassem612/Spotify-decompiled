package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ch71 extends u1p1 {
    public final o571 c;
    public final pe71 d;
    public final ela1 e;
    public final ou80 f;

    public ch71(o571 o571Var, pe71 pe71Var, ela1 ela1Var, ou80 ou80Var) {
        this.c = o571Var;
        this.d = pe71Var;
        this.e = ela1Var;
        this.f = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch71)) {
            return false;
        }
        ch71 ch71Var = (ch71) obj;
        return u890.j(this.c, ch71Var.c) && this.d.equals(ch71Var.d) && this.e.equals(ch71Var.e) && u890.j(this.f, ch71Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
        ou80 ou80Var = this.f;
        return iHashCode + (ou80Var == null ? 0 : ou80Var.a.hashCode());
    }
}
