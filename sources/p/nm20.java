package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nm20 extends tm20 implements fm20 {
    public final ol20 a;
    public final um20 b;
    public final em20 c;

    public nm20(ol20 ol20Var, um20 um20Var, em20 em20Var) {
        this.a = ol20Var;
        this.b = um20Var;
        this.c = em20Var;
    }

    @Override // p.fm20
    public final em20 b() {
        return this.c;
    }

    @Override // p.tm20
    public final ol20 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm20)) {
            return false;
        }
        nm20 nm20Var = (nm20) obj;
        return this.a.equals(nm20Var.a) && u890.j(this.b, nm20Var.b) && u890.j(this.c, nm20Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        um20 um20Var = this.b;
        int iHashCode2 = (iHashCode + (um20Var == null ? 0 : um20Var.hashCode())) * 31;
        em20 em20Var = this.c;
        return iHashCode2 + (em20Var != null ? em20Var.hashCode() : 0);
    }
}
