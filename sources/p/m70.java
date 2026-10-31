package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m70 implements igb1 {
    public final Integer a;
    public final mr20 b;
    public final l70 c;
    public final xu30 d;

    public m70(Integer num, gda0 gda0Var, l70 l70Var, xu30 xu30Var, int i) {
        num = (i & 1) != 0 ? null : num;
        gda0Var = (i & 4) != 0 ? null : gda0Var;
        this.a = num;
        this.b = gda0Var;
        this.c = l70Var;
        this.d = xu30Var;
        ero1.s(new Object[]{num, null, gda0Var}, p4.g);
    }

    @Override // p.igb1
    public final hgb1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m70)) {
            return false;
        }
        m70 m70Var = (m70) obj;
        return u890.j(this.a, m70Var.a) && u890.j(this.b, m70Var.b) && this.c.equals(m70Var.c) && this.d.equals(m70Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 961;
        mr20 mr20Var = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (mr20Var != null ? mr20Var.hashCode() : 0)) * 31)) * 31);
    }
}
