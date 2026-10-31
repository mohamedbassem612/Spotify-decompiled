package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b481 {
    public final String a;
    public final upn1 b;
    public final int c;
    public final azo1 d;
    public final t881 e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final boolean j;

    public b481(String str, upn1 upn1Var, int i, azo1 azo1Var, t881 t881Var, Boolean bool, Boolean bool2, int i2) {
        Boolean bool3 = Boolean.TRUE;
        i = (i2 & 4) != 0 ? 1 : i;
        azo1Var = (i2 & 8) != 0 ? g620.d : azo1Var;
        bool = (i2 & 64) != 0 ? null : bool;
        bool2 = (i2 & 256) != 0 ? null : bool2;
        bool3 = (32768 & i2) != 0 ? null : bool3;
        boolean z = (i2 & 65536) == 0;
        this.a = str;
        this.b = upn1Var;
        this.c = i;
        this.d = azo1Var;
        this.e = t881Var;
        this.f = bool;
        this.g = null;
        this.h = bool2;
        this.i = bool3;
        this.j = z;
    }

    public final boolean a() {
        return this.j;
    }

    public final upn1 b() {
        return this.b;
    }

    public final azo1 c() {
        return this.d;
    }

    public final t881 d() {
        return this.e;
    }

    public final Boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b481)) {
            return false;
        }
        b481 b481Var = (b481) obj;
        return this.a.equals(b481Var.a) && this.b.equals(b481Var.b) && this.c == b481Var.c && this.d.equals(b481Var.d) && u890.j(this.e, b481Var.e) && u890.j(this.f, b481Var.f) && u890.j(this.g, b481Var.g) && u890.j(this.h, b481Var.h) && u890.j(this.i, b481Var.i) && this.j == b481Var.j;
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    public final Boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31;
        t881 t881Var = this.e;
        int iF = kaa0.f(500, (iHashCode + (t881Var == null ? 0 : t881Var.hashCode())) * 31, 31);
        Boolean bool = this.f;
        int iHashCode2 = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 1742810335;
        Boolean bool4 = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31);
    }
}
