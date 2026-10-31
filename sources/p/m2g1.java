package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2g1 {
    public final String a;
    public final String b;
    public final t3g1 c;
    public final t3g1 d;
    public final k8f0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final gqa1 i;
    public final boolean j;
    public final boolean k;

    public m2g1(String str, String str2, t3g1 t3g1Var, t3g1 t3g1Var2, k8f0 k8f0Var, boolean z, boolean z2, boolean z3, gqa1 gqa1Var, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = t3g1Var;
        this.d = t3g1Var2;
        this.e = k8f0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = gqa1Var;
        this.j = z4;
        this.k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m2g1) {
            m2g1 m2g1Var = (m2g1) obj;
            if (this.a.equals(m2g1Var.a) && this.b.equals(m2g1Var.b) && this.c == m2g1Var.c && this.d == m2g1Var.d && u890.j(this.e, m2g1Var.e) && this.f == m2g1Var.f && this.g == m2g1Var.g && this.h == m2g1Var.h && this.i.equals(m2g1Var.i) && this.j == m2g1Var.j && this.k == m2g1Var.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }
}
