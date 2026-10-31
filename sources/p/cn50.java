package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cn50 {
    public final dn50 a;
    public final int b;
    public final int c;
    public final boolean d;

    public cn50(dn50 dn50Var, int i, int i2, boolean z) {
        this.a = dn50Var;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static cn50 a(cn50 cn50Var, int i, int i2, boolean z, int i3) {
        dn50 dn50Var = (i3 & 1) != 0 ? cn50Var.a : dn50.a;
        if ((i3 & 2) != 0) {
            i = cn50Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = cn50Var.c;
        }
        if ((i3 & 8) != 0) {
            z = cn50Var.d;
        }
        return new cn50(dn50Var, i, i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn50)) {
            return false;
        }
        cn50 cn50Var = (cn50) obj;
        return this.a.equals(cn50Var.a) && this.b == cn50Var.b && this.c == cn50Var.c && this.d == cn50Var.d;
    }

    public final int hashCode() {
        int i = this.b;
        int iC = (4301500 + (i == 0 ? 0 : l1d.C(i))) * 31;
        int i2 = this.c;
        return Boolean.hashCode(this.d) + ((iC + (i2 != 0 ? l1d.C(i2) : 0)) * 31);
    }
}
