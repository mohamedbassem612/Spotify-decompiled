package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class q210 {
    public static final p210 Companion = new p210();
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

    public /* synthetic */ q210(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (281 != (i & 281)) {
            o6p1.t(i, 281, o210.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
        this.i = str9;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q210)) {
            return false;
        }
        q210 q210Var = (q210) obj;
        return u890.j(this.a, q210Var.a) && u890.j(this.b, q210Var.b) && u890.j(this.c, q210Var.c) && u890.j(this.d, q210Var.d) && u890.j(this.e, q210Var.e) && u890.j(this.f, q210Var.f) && u890.j(this.g, q210Var.g) && u890.j(this.h, q210Var.h) && u890.j(this.i, q210Var.i) && u890.j(this.j, q210Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = cy30.d(cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iD2 = cy30.d((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.i);
        String str6 = this.j;
        return iD2 + (str6 != null ? str6.hashCode() : 0);
    }

    public q210(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
    }
}
