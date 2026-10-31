package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class loy {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final y4m h;
    public final r840 i;
    public final ast0 j;
    public final doy k;
    public final vpb1 l;
    public final String m;

    public loy(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, y4m y4mVar, r840 r840Var, ast0 ast0Var, doy doyVar, vpb1 vpb1Var, String str5) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = y4mVar;
        this.i = r840Var;
        this.j = ast0Var;
        this.k = doyVar;
        this.l = vpb1Var;
        this.m = str5;
    }

    public static loy a(loy loyVar, String str, String str2, String str3, boolean z, boolean z2, y4m y4mVar, r840 r840Var, ast0 ast0Var, doy doyVar, String str4, int i) {
        return new loy(loyVar.a, loyVar.b, (i & 4) != 0 ? loyVar.c : str, (i & 8) != 0 ? loyVar.d : str2, (i & 16) != 0 ? loyVar.e : str3, (i & 32) != 0 ? loyVar.f : z, (i & 64) != 0 ? loyVar.g : z2, (i & 128) != 0 ? loyVar.h : y4mVar, (i & 256) != 0 ? loyVar.i : r840Var, (i & 512) != 0 ? loyVar.j : ast0Var, (i & 1024) != 0 ? loyVar.k : doyVar, loyVar.l, (i & 4096) != 0 ? loyVar.m : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loy)) {
            return false;
        }
        loy loyVar = (loy) obj;
        return u890.j(this.a, loyVar.a) && this.b == loyVar.b && this.c.equals(loyVar.c) && u890.j(this.d, loyVar.d) && u890.j(this.e, loyVar.e) && this.f == loyVar.f && this.g == loyVar.g && u890.j(this.h, loyVar.h) && u890.j(this.i, loyVar.i) && this.j == loyVar.j && u890.j(this.k, loyVar.k) && u890.j(this.l, loyVar.l) && this.m.equals(loyVar.m);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + xcg1.g(xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g)) * 31)) * 31)) * 31;
        doy doyVar = this.k;
        int iHashCode3 = doyVar != null ? doyVar.hashCode() : 0;
        return this.m.hashCode() + ((this.l.hashCode() + ((iHashCode2 + iHashCode3) * 31)) * 31);
    }
}
