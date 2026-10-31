package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pqk {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final pqk f33p = new pqk("", null, null, "", "", "", "", false, null, true, false, false, false, null, 0, 30724);
    public final String a;
    public final af5 b;
    public final u7h c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final u7h n;
    public final long o;

    public pqk(String str, af5 af5Var, u7h u7hVar, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, boolean z5, u7h u7hVar2, long j, int i) {
        af5Var = (i & 2) != 0 ? null : af5Var;
        u7hVar = (i & 4) != 0 ? null : u7hVar;
        String str7 = (i & 256) != 0 ? null : str6;
        boolean z6 = (i & 2048) != 0 ? false : z4;
        boolean z7 = (i & 4096) == 0 ? z5 : false;
        u7h u7hVar3 = (i & 8192) == 0 ? u7hVar2 : null;
        long j2 = (i & 16384) != 0 ? u7h.j : j;
        this.a = str;
        this.b = af5Var;
        this.c = u7hVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = str7;
        this.j = z2;
        this.k = z3;
        this.l = z6;
        this.m = z7;
        this.n = u7hVar3;
        this.o = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqk)) {
            return false;
        }
        pqk pqkVar = (pqk) obj;
        if (!u890.j(this.a, pqkVar.a) || !u890.j(this.b, pqkVar.b) || !u890.j(this.c, pqkVar.c) || !u890.j(this.d, pqkVar.d) || !this.e.equals(pqkVar.e) || !this.f.equals(pqkVar.f) || !u890.j(this.g, pqkVar.g) || this.h != pqkVar.h || !u890.j(this.i, pqkVar.i) || this.j != pqkVar.j || this.k != pqkVar.k || this.l != pqkVar.l || this.m != pqkVar.m || !u890.j(this.n, pqkVar.n)) {
            return false;
        }
        long j = pqkVar.o;
        int i = u7h.l;
        return z4h1.b(this.o, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        af5 af5Var = this.b;
        int iHashCode2 = (iHashCode + (af5Var == null ? 0 : af5Var.hashCode())) * 31;
        u7h u7hVar = this.c;
        int iG = xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        u7h u7hVar2 = this.n;
        int iHashCode3 = u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0;
        int i = u7h.l;
        return Long.hashCode(this.o) + ((iG2 + iHashCode3) * 31);
    }
}
