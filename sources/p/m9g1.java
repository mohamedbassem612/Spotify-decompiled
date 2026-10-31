package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m9g1 {
    public final String a;
    public final boolean b;
    public final u9g1 c;
    public final boolean d;
    public final w8g1 e;
    public final boolean f;
    public final boolean g;
    public final iu30 h;

    public m9g1(String str, boolean z, u9g1 u9g1Var, boolean z2, w8g1 w8g1Var, boolean z3, boolean z4, iu30 iu30Var) {
        this.a = str;
        this.b = z;
        this.c = u9g1Var;
        this.d = z2;
        this.e = w8g1Var;
        this.f = z3;
        this.g = z4;
        this.h = iu30Var;
    }

    public static m9g1 a(m9g1 m9g1Var, w8g1 w8g1Var, iu30 iu30Var, int i) {
        String str = m9g1Var.a;
        boolean z = m9g1Var.b;
        u9g1 u9g1Var = m9g1Var.c;
        boolean z2 = m9g1Var.d;
        if ((i & 16) != 0) {
            w8g1Var = m9g1Var.e;
        }
        w8g1 w8g1Var2 = w8g1Var;
        boolean z3 = m9g1Var.f;
        boolean z4 = (i & 64) != 0 ? m9g1Var.g : true;
        if ((i & 128) != 0) {
            iu30Var = m9g1Var.h;
        }
        m9g1Var.getClass();
        return new m9g1(str, z, u9g1Var, z2, w8g1Var2, z3, z4, iu30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9g1)) {
            return false;
        }
        m9g1 m9g1Var = (m9g1) obj;
        return u890.j(this.a, m9g1Var.a) && this.b == m9g1Var.b && u890.j(this.c, m9g1Var.c) && this.d == m9g1Var.d && u890.j(this.e, m9g1Var.e) && this.f == m9g1Var.f && this.g == m9g1Var.g && u890.j(this.h, m9g1Var.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.e.hashCode() + xcg1.g((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g);
        iu30 iu30Var = this.h;
        return iG + (iu30Var == null ? 0 : iu30Var.hashCode());
    }

    public /* synthetic */ m9g1(String str, boolean z, u9g1 u9g1Var, w8g1 w8g1Var, boolean z2) {
        this(str, z, u9g1Var, true, w8g1Var, z2, false, null);
    }
}
