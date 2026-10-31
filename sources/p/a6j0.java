package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a6j0 extends p371 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final dqi1 e;
    public final Map f;
    public final o371 g;

    public /* synthetic */ a6j0(String str, String str2, String str3, String str4, dqi1 dqi1Var, Map map, o371 o371Var, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : dqi1Var, map, (i & 64) != 0 ? new o371(null, false, false, 7) : o371Var);
    }

    public static a6j0 g(a6j0 a6j0Var, Map map, o371 o371Var, int i) {
        String str = a6j0Var.a;
        String str2 = a6j0Var.b;
        String str3 = a6j0Var.c;
        String str4 = a6j0Var.d;
        dqi1 dqi1Var = a6j0Var.e;
        if ((i & 32) != 0) {
            map = a6j0Var.f;
        }
        Map map2 = map;
        if ((i & 64) != 0) {
            o371Var = a6j0Var.g;
        }
        return new a6j0(str, str2, str3, str4, dqi1Var, map2, o371Var);
    }

    @Override // p.p371
    public final String b() {
        return this.d;
    }

    @Override // p.p371
    public final o371 c() {
        return this.g;
    }

    @Override // p.p371
    public final String d() {
        return this.a;
    }

    @Override // p.p371
    public final Map e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6j0)) {
            return false;
        }
        a6j0 a6j0Var = (a6j0) obj;
        return u890.j(this.a, a6j0Var.a) && u890.j(this.b, a6j0Var.b) && u890.j(this.c, a6j0Var.c) && u890.j(this.d, a6j0Var.d) && u890.j(this.e, a6j0Var.e) && u890.j(this.f, a6j0Var.f) && u890.j(this.g, a6j0Var.g);
    }

    @Override // p.p371
    public final dqi1 f() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        dqi1 dqi1Var = this.e;
        return this.g.hashCode() + cy30.e((iHashCode4 + (dqi1Var != null ? dqi1Var.hashCode() : 0)) * 31, 31, this.f);
    }

    public a6j0(String str, String str2, String str3, String str4, dqi1 dqi1Var, Map map, o371 o371Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dqi1Var;
        this.f = map;
        this.g = o371Var;
    }
}
