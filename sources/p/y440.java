package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y440 implements a540 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public y440(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y440)) {
            return false;
        }
        y440 y440Var = (y440) obj;
        return this.a.equals(y440Var.a) && this.b.equals(y440Var.b) && this.c.equals(y440Var.c) && u890.j(this.d, y440Var.d) && this.e.equals(y440Var.e) && this.f.equals(y440Var.f) && u890.j(this.g, y440Var.g) && u890.j(this.h, y440Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
