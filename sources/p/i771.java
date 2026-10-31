package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i771 {
    public final k771 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public i771(k771 k771Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        str8 = (i & 256) != 0 ? null : str8;
        this.a = k771Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final String a() {
        return this.i;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i771)) {
            return false;
        }
        i771 i771Var = (i771) obj;
        return this.a == i771Var.a && u890.j(this.b, i771Var.b) && u890.j(this.c, i771Var.c) && u890.j(this.d, i771Var.d) && u890.j(this.e, i771Var.e) && u890.j(this.f, i771Var.f) && u890.j(this.g, i771Var.g) && u890.j(this.h, i771Var.h) && u890.j(this.i, i771Var.i);
    }

    public final String f() {
        return this.e;
    }

    public final k771 g() {
        return this.a;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
    }

    public final String i() {
        return this.f;
    }
}
