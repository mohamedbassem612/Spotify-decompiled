package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n081 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final l081 e;
    public final d081 f;
    public final boolean g;
    public final iix0 h;
    public final boolean i;

    public n081(String str, String str2, String str3, boolean z, l081 l081Var, d081 d081Var, boolean z2, iix0 iix0Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l081Var;
        this.f = d081Var;
        this.g = z2;
        this.h = iix0Var;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n081)) {
            return false;
        }
        n081 n081Var = (n081) obj;
        return this.a.equals(n081Var.a) && this.b.equals(n081Var.b) && this.c.equals(n081Var.c) && this.d == n081Var.d && u890.j(this.e, n081Var.e) && u890.j(this.f, n081Var.f) && this.g == n081Var.g && u890.j(this.h, n081Var.h) && this.i == n081Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + xcg1.g((this.f.hashCode() + ((this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g)) * 31);
    }
}
