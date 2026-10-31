package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p8v0 {
    public final String a;
    public final String b;
    public final g8v0 c;
    public final f8v0 d;
    public final e8v0 e;
    public final i8p1 f;
    public final m8v0 g;
    public final boolean h;

    public p8v0(String str, String str2, g8v0 g8v0Var, f8v0 f8v0Var, e8v0 e8v0Var, i8p1 i8p1Var, m8v0 m8v0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = g8v0Var;
        this.d = f8v0Var;
        this.e = e8v0Var;
        this.f = i8p1Var;
        this.g = m8v0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8v0)) {
            return false;
        }
        p8v0 p8v0Var = (p8v0) obj;
        return this.a.equals(p8v0Var.a) && u890.j(this.b, p8v0Var.b) && this.c.equals(p8v0Var.c) && this.d.equals(p8v0Var.d) && u890.j(this.e, p8v0Var.e) && this.f.equals(p8v0Var.f) && this.g.equals(p8v0Var.g) && this.h == p8v0Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c.c)) * 31;
        e8v0 e8v0Var = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (e8v0Var == null ? 0 : e8v0Var.hashCode())) * 31)) * 31)) * 31);
    }
}
