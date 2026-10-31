package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vzg implements wzg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public vzg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    @Override // p.wzg
    public final String a() {
        return this.h;
    }

    @Override // p.wzg
    public final String b() {
        return this.k;
    }

    @Override // p.wzg
    public final String c() {
        return this.j;
    }

    @Override // p.wzg
    public final String d() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzg)) {
            return false;
        }
        vzg vzgVar = (vzg) obj;
        return this.a.equals(vzgVar.a) && this.b.equals(vzgVar.b) && this.c.equals(vzgVar.c) && this.d.equals(vzgVar.d) && this.e.equals(vzgVar.e) && this.f.equals(vzgVar.f) && this.g.equals(vzgVar.g) && this.h.equals(vzgVar.h) && this.i.equals(vzgVar.i) && this.j.equals(vzgVar.j) && this.k.equals(vzgVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
