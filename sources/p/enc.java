package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class enc {
    public final String a;
    public final String b;
    public final String c;
    public final tv80 d;
    public final boolean e;
    public final boolean f;
    public final Long g;
    public final boolean h;

    public /* synthetic */ enc(String str, String str2, tv80 tv80Var, boolean z, boolean z2, Long l, int i) {
        this(str, str2, null, tv80Var, z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : l, false);
    }

    public static enc a(enc encVar, String str, Long l, int i) {
        if ((i & 1) != 0) {
            str = encVar.a;
        }
        String str2 = str;
        String str3 = encVar.b;
        String str4 = encVar.c;
        tv80 tv80Var = encVar.d;
        boolean z = encVar.e;
        boolean z2 = encVar.f;
        if ((i & 64) != 0) {
            l = encVar.g;
        }
        Long l2 = l;
        boolean z3 = (i & 128) != 0 ? encVar.h : false;
        encVar.getClass();
        return new enc(str2, str3, str4, tv80Var, z, z2, l2, z3);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final tv80 d() {
        return this.d;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enc)) {
            return false;
        }
        enc encVar = (enc) obj;
        return u890.j(this.a, encVar.a) && u890.j(this.b, encVar.b) && u890.j(this.c, encVar.c) && u890.j(this.d, encVar.d) && this.e == encVar.e && this.f == encVar.f && u890.j(this.g, encVar.g) && this.h == encVar.h;
    }

    public final Long f() {
        return this.g;
    }

    public final String g() {
        return this.b;
    }

    public final boolean h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        tv80 tv80Var = this.d;
        int iG = xcg1.g(xcg1.g((iHashCode3 + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.e), 31, this.f);
        Long l = this.g;
        return Boolean.hashCode(this.h) + ((iG + (l != null ? l.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.e;
    }

    public enc(String str, String str2, String str3, tv80 tv80Var, boolean z, boolean z2, Long l, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = tv80Var;
        this.e = z;
        this.f = z2;
        this.g = l;
        this.h = z3;
    }
}
