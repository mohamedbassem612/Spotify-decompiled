package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class rds0 {
    public static final qds0 Companion = new qds0();
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

    public /* synthetic */ rds0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        if (4095 != (i & 4095)) {
            o6p1.t(i, 4095, pds0.a.getDescriptor());
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
        if (!(obj instanceof rds0)) {
            return false;
        }
        rds0 rds0Var = (rds0) obj;
        return u890.j(this.a, rds0Var.a) && u890.j(this.b, rds0Var.b) && u890.j(this.c, rds0Var.c) && u890.j(this.d, rds0Var.d) && u890.j(this.e, rds0Var.e) && u890.j(this.f, rds0Var.f) && u890.j(this.g, rds0Var.g) && u890.j(this.h, rds0Var.h) && u890.j(this.i, rds0Var.i) && u890.j(this.j, rds0Var.j) && u890.j(this.k, rds0Var.k) && u890.j(this.l, rds0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public rds0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
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
