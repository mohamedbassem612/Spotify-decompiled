package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mb31 implements ob31 {
    public final String a;
    public final vbe b;
    public final ega1 c;
    public final km90 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public mb31(String str, vbe vbeVar, ega1 ega1Var, km90 km90Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = vbeVar;
        this.c = ega1Var;
        this.d = km90Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean a() {
        return this.f;
    }

    public final vbe b() {
        return this.b;
    }

    public final km90 c() {
        return this.d;
    }

    public final ega1 d() {
        return this.c;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb31)) {
            return false;
        }
        mb31 mb31Var = (mb31) obj;
        return u890.j(this.a, mb31Var.a) && u890.j(this.b, mb31Var.b) && u890.j(this.c, mb31Var.c) && u890.j(this.d, mb31Var.d) && this.e == mb31Var.e && this.f == mb31Var.f && this.g == mb31Var.g;
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
