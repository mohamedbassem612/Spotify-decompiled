package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wog extends xog {
    public final String a;
    public final long b;
    public final o571 c;
    public final c380 d;
    public final int e;
    public final int f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f16p;

    public wog(String str, long j, o571 o571Var, c380 c380Var, int i, int i2, String str2, long j2, long j3, String str3, String str4, String str5, String str6, String str7, Integer num, String str8) {
        this.a = str;
        this.b = j;
        this.c = o571Var;
        this.d = c380Var;
        this.e = i;
        this.f = i2;
        this.g = str2;
        this.h = j2;
        this.i = j3;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = num;
        this.f16p = str8;
    }

    public static wog a(wog wogVar, int i, String str, int i2) {
        return new wog(wogVar.a, wogVar.b, wogVar.c, wogVar.d, wogVar.e, (i2 & 32) != 0 ? wogVar.f : i, wogVar.g, wogVar.h, wogVar.i, wogVar.j, wogVar.k, (i2 & 2048) != 0 ? wogVar.l : str, wogVar.m, wogVar.n, wogVar.o, wogVar.f16p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wog)) {
            return false;
        }
        wog wogVar = (wog) obj;
        return this.a.equals(wogVar.a) && this.b == wogVar.b && u890.j(this.c, wogVar.c) && u890.j(this.d, wogVar.d) && this.e == wogVar.e && this.f == wogVar.f && u890.j(this.g, wogVar.g) && this.h == wogVar.h && this.i == wogVar.i && this.j.equals(wogVar.j) && u890.j(this.k, wogVar.k) && u890.j(this.l, wogVar.l) && u890.j(this.m, wogVar.m) && u890.j(this.n, wogVar.n) && this.o.equals(wogVar.o) && u890.j(this.f16p, wogVar.f16p);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.f(cy30.f(cy30.d(kaa0.f(this.f, kaa0.f(this.e, kk0.f(this.d, (this.c.hashCode() + cy30.f(this.a.hashCode() * 31, this.b, 31)) * 31, 31), 31), 31), 31, this.g), this.h, 31), this.i, 31), 31, this.j), 31, this.k);
        String str = this.l;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iE = pze0.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.o);
        String str4 = this.f16p;
        return iE + (str4 != null ? str4.hashCode() : 0);
    }
}
