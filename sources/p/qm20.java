package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qm20 extends tm20 implements fm20, cm20 {
    public final ol20 a;
    public final boolean b;
    public final um20 c;
    public final em20 d;

    public qm20(ol20 ol20Var, boolean z, um20 um20Var, em20 em20Var) {
        this.a = ol20Var;
        this.b = z;
        this.c = um20Var;
        this.d = em20Var;
    }

    public final boolean a() {
        return this.b;
    }

    @Override // p.fm20
    public final em20 b() {
        return this.d;
    }

    @Override // p.tm20
    public final ol20 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm20)) {
            return false;
        }
        qm20 qm20Var = (qm20) obj;
        return this.a.equals(qm20Var.a) && this.b == qm20Var.b && u890.j(this.c, qm20Var.c) && u890.j(this.d, qm20Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        um20 um20Var = this.c;
        int iHashCode = (iG + (um20Var == null ? 0 : um20Var.hashCode())) * 31;
        em20 em20Var = this.d;
        return iHashCode + (em20Var != null ? em20Var.hashCode() : 0);
    }
}
