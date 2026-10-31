package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xbk {
    public final String a;
    public final nbk b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final x9r m;
    public final x9r n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u7h f51p;
    public final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xbk(String str, nbk nbkVar, String str2, h290 h290Var, h290 h290Var2, String str3, String str4, String str5, String str6, String str7, boolean z, u7h u7hVar, int i) {
        String str8 = (i & 1) != 0 ? "" : str;
        nbk nbkVar2 = (i & 2) != 0 ? new nbk(2047, null, null, null, null, null) : nbkVar;
        String str9 = (i & 4) != 0 ? null : str2;
        int i2 = i & 8;
        h290 h290Var3 = z6x.a;
        this(str8, nbkVar2, str9, i2 != 0 ? h290Var3 : h290Var, (i & 16) != 0 ? h290Var3 : h290Var2, h290Var3, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? false : z, null, null, 0, (i & 32768) != 0 ? null : u7hVar, false);
    }

    public static xbk a(xbk xbkVar, h290 h290Var, h290 h290Var2, String str, String str2, String str3, String str4, String str5, x9r x9rVar, x9r x9rVar2, int i, boolean z, int i2) {
        return new xbk(xbkVar.a, xbkVar.b, xbkVar.c, (i2 & 8) != 0 ? xbkVar.d : h290Var, (i2 & 16) != 0 ? xbkVar.e : h290Var2, xbkVar.f, (i2 & 64) != 0 ? xbkVar.g : str, (i2 & 128) != 0 ? xbkVar.h : str2, (i2 & 256) != 0 ? xbkVar.i : str3, (i2 & 512) != 0 ? xbkVar.j : str4, (i2 & 1024) != 0 ? xbkVar.k : str5, (i2 & 2048) != 0 ? xbkVar.l : false, (i2 & 4096) != 0 ? xbkVar.m : x9rVar, (i2 & 8192) != 0 ? xbkVar.n : x9rVar2, (i2 & 16384) != 0 ? xbkVar.o : i, xbkVar.f51p, (i2 & 65536) != 0 ? xbkVar.q : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbk)) {
            return false;
        }
        xbk xbkVar = (xbk) obj;
        return u890.j(this.a, xbkVar.a) && u890.j(this.b, xbkVar.b) && u890.j(this.c, xbkVar.c) && u890.j(this.d, xbkVar.d) && u890.j(this.e, xbkVar.e) && u890.j(this.f, xbkVar.f) && u890.j(this.g, xbkVar.g) && u890.j(this.h, xbkVar.h) && u890.j(this.i, xbkVar.i) && u890.j(this.j, xbkVar.j) && u890.j(this.k, xbkVar.k) && this.l == xbkVar.l && u890.j(this.m, xbkVar.m) && u890.j(this.n, xbkVar.n) && this.o == xbkVar.o && u890.j(this.f51p, xbkVar.f51p) && this.q == xbkVar.q;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iB = f4i1.b(f4i1.b(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iG = xcg1.g(cy30.d((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.k), 31, this.l);
        x9r x9rVar = this.m;
        int iHashCode5 = (iG + (x9rVar == null ? 0 : x9rVar.hashCode())) * 31;
        x9r x9rVar2 = this.n;
        int iF = kaa0.f(this.o, (iHashCode5 + (x9rVar2 == null ? 0 : x9rVar2.hashCode())) * 31, 31);
        u7h u7hVar = this.f51p;
        return Boolean.hashCode(this.q) + ((iF + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0)) * 31);
    }

    public xbk(String str, nbk nbkVar, String str2, List list, List list2, List list3, String str3, String str4, String str5, String str6, String str7, boolean z, x9r x9rVar, x9r x9rVar2, int i, u7h u7hVar, boolean z2) {
        this.a = str;
        this.b = nbkVar;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = z;
        this.m = x9rVar;
        this.n = x9rVar2;
        this.o = i;
        this.f51p = u7hVar;
        this.q = z2;
    }
}
