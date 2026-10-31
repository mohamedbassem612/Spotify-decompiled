package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oxd0 implements rxd0 {
    public final a0e0 a;
    public final tv80 b;
    public final int c;

    public oxd0(a0e0 a0e0Var, tv80 tv80Var, int i) {
        this.a = a0e0Var;
        this.b = tv80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxd0)) {
            return false;
        }
        oxd0 oxd0Var = (oxd0) obj;
        return u890.j(this.a, oxd0Var.a) && u890.j(this.b, oxd0Var.b) && this.c == oxd0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return l1d.C(this.c) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
