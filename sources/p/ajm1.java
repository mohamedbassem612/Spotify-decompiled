package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ajm1 {
    public static final zim1 Companion = new zim1();
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

    public /* synthetic */ ajm1(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if (4095 != (i & 4095)) {
            o6p1.t(i, 4095, yim1.a.getDescriptor());
            throw null;
        }
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajm1)) {
            return false;
        }
        ajm1 ajm1Var = (ajm1) obj;
        return u890.j(this.a, ajm1Var.a) && u890.j(this.b, ajm1Var.b) && u890.j(this.c, ajm1Var.c) && u890.j(this.d, ajm1Var.d) && u890.j(this.e, ajm1Var.e) && u890.j(this.f, ajm1Var.f) && u890.j(this.g, ajm1Var.g) && u890.j(this.h, ajm1Var.h) && u890.j(this.i, ajm1Var.i) && u890.j(this.j, ajm1Var.j) && u890.j(this.k, ajm1Var.k) && u890.j(this.l, ajm1Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public ajm1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
}
