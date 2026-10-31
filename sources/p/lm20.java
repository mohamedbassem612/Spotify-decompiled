package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lm20 extends tm20 implements fm20, cm20 {
    public final ol20 a;
    public final boolean b;
    public final em20 c;

    public lm20(ol20 ol20Var, boolean z, em20 em20Var) {
        this.a = ol20Var;
        this.b = z;
        this.c = em20Var;
    }

    public final boolean a() {
        return this.b;
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
        if (!(obj instanceof lm20)) {
            return false;
        }
        lm20 lm20Var = (lm20) obj;
        return this.a.equals(lm20Var.a) && this.b == lm20Var.b && u890.j(this.c, lm20Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        em20 em20Var = this.c;
        return iG + (em20Var == null ? 0 : em20Var.hashCode());
    }
}
