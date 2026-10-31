package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xa0 {
    public final String a;
    public final f0u b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public xa0(String str, f0u f0uVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = f0uVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return u890.j(this.a, xa0Var.a) && this.b == xa0Var.b && this.c == xa0Var.c && this.d == xa0Var.d && this.e == xa0Var.e && this.f == xa0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
