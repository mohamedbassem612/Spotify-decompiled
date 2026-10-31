package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d4c0 {
    public final vqo1 a;
    public final boolean b;
    public final ou80 c;
    public final y6r0 d;

    public d4c0(vqo1 vqo1Var, boolean z, ou80 ou80Var, y6r0 y6r0Var) {
        this.a = vqo1Var;
        this.b = z;
        this.c = ou80Var;
        this.d = y6r0Var;
    }

    public static d4c0 a(d4c0 d4c0Var, vqo1 vqo1Var, boolean z, int i) {
        if ((i & 1) != 0) {
            vqo1Var = d4c0Var.a;
        }
        if ((i & 2) != 0) {
            z = d4c0Var.b;
        }
        return new d4c0(vqo1Var, z, d4c0Var.c, d4c0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4c0)) {
            return false;
        }
        d4c0 d4c0Var = (d4c0) obj;
        return this.a.equals(d4c0Var.a) && this.b == d4c0Var.b && u890.j(this.c, d4c0Var.c) && u890.j(this.d, d4c0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        ou80 ou80Var = this.c;
        int iHashCode = (iG + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31;
        y6r0 y6r0Var = this.d;
        return iHashCode + (y6r0Var != null ? y6r0Var.a.hashCode() : 0);
    }
}
