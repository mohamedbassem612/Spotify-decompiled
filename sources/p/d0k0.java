package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d0k0 {
    public final m8w0 a;
    public final lhg1 b;
    public final lhg1 c;
    public final lhg1 d;
    public final xx8 e;
    public final Integer f;

    public d0k0(m8w0 m8w0Var, lhg1 lhg1Var, lhg1 lhg1Var2, lhg1 lhg1Var3, xx8 xx8Var, Integer num) {
        this.a = m8w0Var;
        this.b = lhg1Var;
        this.c = lhg1Var2;
        this.d = lhg1Var3;
        this.e = xx8Var;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0k0)) {
            return false;
        }
        d0k0 d0k0Var = (d0k0) obj;
        return u890.j(this.a, d0k0Var.a) && u890.j(this.b, d0k0Var.b) && u890.j(this.c, d0k0Var.c) && u890.j(this.d, d0k0Var.d) && this.e == d0k0Var.e && u890.j(this.f, d0k0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        lhg1 lhg1Var = this.c;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (lhg1Var == null ? 0 : lhg1Var.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
