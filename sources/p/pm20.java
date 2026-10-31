package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pm20 extends tm20 implements fm20 {
    public final ol20 a;
    public final em20 b;

    public pm20(ol20 ol20Var, em20 em20Var) {
        this.a = ol20Var;
        this.b = em20Var;
    }

    @Override // p.fm20
    public final em20 b() {
        return this.b;
    }

    @Override // p.tm20
    public final ol20 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm20)) {
            return false;
        }
        pm20 pm20Var = (pm20) obj;
        return this.a.equals(pm20Var.a) && u890.j(this.b, pm20Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        em20 em20Var = this.b;
        return iHashCode + (em20Var == null ? 0 : em20Var.hashCode());
    }
}
