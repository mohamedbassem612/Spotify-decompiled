package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class phm0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final hux f;
    public final int g;

    public phm0(String str, String str2, String str3, String str4, boolean z, hux huxVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = huxVar;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phm0)) {
            return false;
        }
        phm0 phm0Var = (phm0) obj;
        return u890.j(this.a, phm0Var.a) && this.b.equals(phm0Var.b) && this.c.equals(phm0Var.c) && u890.j(this.d, phm0Var.d) && this.e == phm0Var.e && u890.j(this.f, phm0Var.f) && this.g == phm0Var.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + eqq.k(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
