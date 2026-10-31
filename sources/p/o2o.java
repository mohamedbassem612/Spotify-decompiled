package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o2o implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Long o;

    public o2o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, String str10, String str11, String str12, String str13, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = j;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
        this.o = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2o)) {
            return false;
        }
        o2o o2oVar = (o2o) obj;
        return this.a.equals(o2oVar.a) && this.b.equals(o2oVar.b) && this.c.equals(o2oVar.c) && this.d.equals(o2oVar.d) && this.e.equals(o2oVar.e) && this.f.equals(o2oVar.f) && this.g.equals(o2oVar.g) && this.h.equals(o2oVar.h) && this.i.equals(o2oVar.i) && this.j == o2oVar.j && this.k.equals(o2oVar.k) && this.l.equals(o2oVar.l) && this.m.equals(o2oVar.m) && this.n.equals(o2oVar.n) && u890.j(this.o, o2oVar.o);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), this.j, 31), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        Long l = this.o;
        return iD + (l == null ? 0 : l.hashCode());
    }
}
