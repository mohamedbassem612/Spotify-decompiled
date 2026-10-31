package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qc0 {
    public final String a;
    public final String b;
    public final f0u c;
    public final String d;
    public final String e;
    public final c380 f;
    public final pc0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public qc0(String str, String str2, f0u f0uVar, String str3, String str4, c380 c380Var, pc0 pc0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = f0uVar;
        this.d = str3;
        this.e = str4;
        this.f = c380Var;
        this.g = pc0Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0)) {
            return false;
        }
        qc0 qc0Var = (qc0) obj;
        return this.a.equals(qc0Var.a) && this.b.equals(qc0Var.b) && this.c == qc0Var.c && u890.j(this.d, qc0Var.d) && u890.j(this.e, qc0Var.e) && u890.j(this.f, qc0Var.f) && this.g.equals(qc0Var.g) && this.h == qc0Var.h && this.i == qc0Var.i && this.j == qc0Var.j && this.k == qc0Var.k && this.l == qc0Var.l && this.m == qc0Var.m && this.n == qc0Var.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.g.hashCode() + kk0.f(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }
}
