package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qhj1 {
    public final String a;
    public final String b;
    public final jlw0 c;
    public final jlw0 d;
    public final int e;
    public final int f;
    public final String g;
    public final u771 h;
    public final long i;
    public final boolean j;

    public qhj1(String str, String str2, jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str3, u771 u771Var, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = jlw0Var;
        this.d = jlw0Var2;
        this.e = i;
        this.f = i2;
        this.g = str3;
        this.h = u771Var;
        this.i = j;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhj1)) {
            return false;
        }
        qhj1 qhj1Var = (qhj1) obj;
        return u890.j(this.a, qhj1Var.a) && u890.j(this.b, qhj1Var.b) && u890.j(this.c, qhj1Var.c) && u890.j(this.d, qhj1Var.d) && this.e == qhj1Var.e && this.f == qhj1Var.f && u890.j(this.g, qhj1Var.g) && u890.j(this.h, qhj1Var.h) && vve1.a(this.i, qhj1Var.i) && this.j == qhj1Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jlw0 jlw0Var = this.c;
        return Boolean.hashCode(this.j) + cy30.f(cfm0.g(this.h, cy30.d(kaa0.f(this.f, kaa0.f(this.e, (this.d.hashCode() + ((iD + (jlw0Var == null ? 0 : jlw0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.g), 31), this.i, 31);
    }
}
