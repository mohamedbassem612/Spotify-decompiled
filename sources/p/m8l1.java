package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m8l1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final l8l1 d;

    public m8l1(boolean z, boolean z2, boolean z3, l8l1 l8l1Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = l8l1Var;
    }

    public static m8l1 a(m8l1 m8l1Var, boolean z, boolean z2, boolean z3, l8l1 l8l1Var, int i) {
        if ((i & 1) != 0) {
            z = m8l1Var.a;
        }
        if ((i & 2) != 0) {
            z2 = m8l1Var.b;
        }
        if ((i & 4) != 0) {
            z3 = m8l1Var.c;
        }
        if ((i & 8) != 0) {
            l8l1Var = m8l1Var.d;
        }
        m8l1Var.getClass();
        return new m8l1(z, z2, z3, l8l1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8l1)) {
            return false;
        }
        m8l1 m8l1Var = (m8l1) obj;
        return this.a == m8l1Var.a && this.b == m8l1Var.b && this.c == m8l1Var.c && u890.j(this.d, m8l1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        l8l1 l8l1Var = this.d;
        return iG + (l8l1Var == null ? 0 : l8l1Var.hashCode());
    }
}
