package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class om91 {
    public final String a;
    public final rp91 b;
    public final rp91 c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public om91(String str, rp91 rp91Var, rp91 rp91Var2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = rp91Var;
        this.c = rp91Var2;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om91)) {
            return false;
        }
        om91 om91Var = (om91) obj;
        return u890.j(this.a, om91Var.a) && this.b == om91Var.b && this.c == om91Var.c && this.d == om91Var.d && this.e == om91Var.e && this.f == om91Var.f && this.g == om91Var.g && this.h == om91Var.h;
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        int i = this.e;
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g((iK + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.f), 31, this.g);
    }
}
