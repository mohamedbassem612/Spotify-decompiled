package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l4v0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public l4v0(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4v0)) {
            return false;
        }
        l4v0 l4v0Var = (l4v0) obj;
        return this.a.equals(l4v0Var.a) && this.b.equals(l4v0Var.b) && this.c == l4v0Var.c && this.d == l4v0Var.d && this.e == l4v0Var.e && this.f == l4v0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(kaa0.f(this.d, xcg1.g(cy30.d(this.a.hashCode() * 31, 961, this.b), 31, this.c), 31), 31, this.e);
    }
}
