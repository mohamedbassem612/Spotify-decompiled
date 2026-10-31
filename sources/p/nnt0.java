package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nnt0 {
    public final String a;
    public final String b;
    public final String c;
    public final jmt0 d;
    public final dm5 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final u7h l;
    public final u7h m;
    public final u7h n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22p;
    public final t650 q;

    public nnt0(String str, String str2, String str3, jmt0 jmt0Var, dm5 dm5Var, boolean z, boolean z2, String str4, String str5, String str6, String str7, u7h u7hVar, u7h u7hVar2, u7h u7hVar3, String str8, boolean z3, t650 t650Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jmt0Var;
        this.e = dm5Var;
        this.f = z;
        this.g = z2;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = u7hVar;
        this.m = u7hVar2;
        this.n = u7hVar3;
        this.o = str8;
        this.f22p = z3;
        this.q = t650Var;
    }

    public final jmt0 a() {
        return this.d;
    }

    public final dm5 b() {
        return this.e;
    }

    public final String c() {
        return this.h;
    }

    public final boolean d() {
        return this.f22p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnt0)) {
            return false;
        }
        nnt0 nnt0Var = (nnt0) obj;
        return u890.j(this.a, nnt0Var.a) && u890.j(this.b, nnt0Var.b) && u890.j(this.c, nnt0Var.c) && u890.j(this.d, nnt0Var.d) && u890.j(this.e, nnt0Var.e) && this.f == nnt0Var.f && this.g == nnt0Var.g && u890.j(this.h, nnt0Var.h) && this.i.equals(nnt0Var.i) && u890.j(this.j, nnt0Var.j) && u890.j(this.k, nnt0Var.k) && u890.j(this.l, nnt0Var.l) && u890.j(this.m, nnt0Var.m) && u890.j(this.n, nnt0Var.n) && u890.j(this.o, nnt0Var.o) && this.f22p == nnt0Var.f22p && u890.j(this.q, nnt0Var.q);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jmt0 jmt0Var = this.d;
        int iHashCode4 = (iHashCode3 + (jmt0Var == null ? 0 : jmt0Var.hashCode())) * 31;
        dm5 dm5Var = this.e;
        int iD = cy30.d(cy30.d(xcg1.g(xcg1.g((iHashCode4 + (dm5Var == null ? 0 : dm5Var.hashCode())) * 31, 31, this.f), 961, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int iHashCode5 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        u7h u7hVar = this.l;
        int iHashCode7 = (iHashCode6 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.m;
        int iHashCode8 = (iHashCode7 + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31;
        u7h u7hVar3 = this.n;
        int iHashCode9 = (iHashCode8 + (u7hVar3 == null ? 0 : Long.hashCode(u7hVar3.a))) * 31;
        String str5 = this.o;
        int iG = xcg1.g((iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f22p);
        t650 t650Var = this.q;
        return iG + (t650Var != null ? t650Var.a.hashCode() : 0);
    }
}
