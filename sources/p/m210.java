package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class m210 {
    public static final l210 Companion = new l210();
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

    public /* synthetic */ m210(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str11;
        }
    }

    public static m210 a(String str, m210 m210Var) {
        return new m210(m210Var.a, m210Var.b, m210Var.c, m210Var.d, m210Var.e, m210Var.f, z2s0.d, str, m210Var.i, m210Var.j, m210Var.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m210)) {
            return false;
        }
        m210 m210Var = (m210) obj;
        return u890.j(this.a, m210Var.a) && u890.j(this.b, m210Var.b) && u890.j(this.c, m210Var.c) && u890.j(this.d, m210Var.d) && u890.j(this.e, m210Var.e) && u890.j(this.f, m210Var.f) && u890.j(this.g, m210Var.g) && u890.j(this.h, m210Var.h) && u890.j(this.i, m210Var.i) && u890.j(this.j, m210Var.j) && u890.j(this.k, m210Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public m210(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
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

    public /* synthetic */ m210(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, "", (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10);
    }
}
