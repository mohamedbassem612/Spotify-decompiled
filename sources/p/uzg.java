package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uzg implements wzg {
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
    public final String l;

    public uzg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
        this.l = str12;
    }

    @Override // p.wzg
    public final String a() {
        return this.i;
    }

    @Override // p.wzg
    public final String b() {
        return this.l;
    }

    @Override // p.wzg
    public final String c() {
        return this.k;
    }

    @Override // p.wzg
    public final String d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzg)) {
            return false;
        }
        uzg uzgVar = (uzg) obj;
        return this.a.equals(uzgVar.a) && this.b.equals(uzgVar.b) && this.c.equals(uzgVar.c) && this.d.equals(uzgVar.d) && this.e.equals(uzgVar.e) && this.f.equals(uzgVar.f) && this.g.equals(uzgVar.g) && this.h.equals(uzgVar.h) && this.i.equals(uzgVar.i) && this.j.equals(uzgVar.j) && this.k.equals(uzgVar.k) && this.l.equals(uzgVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
