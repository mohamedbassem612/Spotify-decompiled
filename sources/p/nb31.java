package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nb31 implements ob31 {
    public final String a;
    public final vbe b;
    public final ega1 c;
    public final km90 d;
    public final boolean e;
    public final boolean f;

    public nb31(String str, vbe vbeVar, ega1 ega1Var, km90 km90Var, boolean z, boolean z2) {
        this.a = str;
        this.b = vbeVar;
        this.c = ega1Var;
        this.d = km90Var;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        return this.e;
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
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb31)) {
            return false;
        }
        nb31 nb31Var = (nb31) obj;
        return u890.j(this.a, nb31Var.a) && u890.j(this.b, nb31Var.b) && this.c.equals(nb31Var.c) && u890.j(this.d, nb31Var.d) && this.e == nb31Var.e && this.f == nb31Var.f;
    }

    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }
}
