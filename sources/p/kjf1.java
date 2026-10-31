package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kjf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final vw01 h;
    public final idd1 i;

    public kjf1(String str, String str2, String str3, String str4, String str5, String str6, String str7, vw01 vw01Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = vw01Var;
        this.i = new idd1(new j4f1(this, (byte) 5));
    }

    public static kjf1 a(kjf1 kjf1Var, String str, vw01 vw01Var, int i) {
        String str2 = kjf1Var.a;
        String str3 = kjf1Var.b;
        String str4 = kjf1Var.c;
        String str5 = kjf1Var.d;
        String str6 = kjf1Var.e;
        String str7 = kjf1Var.f;
        if ((i & 64) != 0) {
            str = kjf1Var.g;
        }
        String str8 = str;
        if ((i & 128) != 0) {
            vw01Var = kjf1Var.h;
        }
        return new kjf1(str2, str3, str4, str5, str6, str7, str8, vw01Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjf1)) {
            return false;
        }
        kjf1 kjf1Var = (kjf1) obj;
        return u890.j(this.a, kjf1Var.a) && u890.j(this.b, kjf1Var.b) && u890.j(this.c, kjf1Var.c) && u890.j(this.d, kjf1Var.d) && u890.j(this.e, kjf1Var.e) && u890.j(this.f, kjf1Var.f) && u890.j(this.g, kjf1Var.g) && this.h == kjf1Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public /* synthetic */ kjf1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, vw01.c);
    }
}
