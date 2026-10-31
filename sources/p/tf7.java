package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tf7 implements xf7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final tv80 g;

    public tf7(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf7)) {
            return false;
        }
        tf7 tf7Var = (tf7) obj;
        return u890.j(this.a, tf7Var.a) && u890.j(this.b, tf7Var.b) && this.c == tf7Var.c && this.d == tf7Var.d && this.e == tf7Var.e && this.f == tf7Var.f && u890.j(this.g, tf7Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
