package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class em10 {
    public final osv0 a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public em10(osv0 osv0Var, int i, boolean z, boolean z2) {
        this.a = osv0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static em10 a(em10 em10Var, boolean z) {
        osv0 osv0Var = em10Var.a;
        int i = em10Var.b;
        boolean z2 = em10Var.d;
        em10Var.getClass();
        return new em10(osv0Var, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em10)) {
            return false;
        }
        em10 em10Var = (em10) obj;
        return this.a.equals(em10Var.a) && this.b == em10Var.b && this.c == em10Var.c && this.d == em10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
