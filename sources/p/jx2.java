package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jx2 {
    public final String a;
    public final String b;
    public final xkg0 c;
    public final String d;
    public final String e;
    public final String f;

    public jx2(String str, String str2, String str3, String str4, String str5, xkg0 xkg0Var) {
        this.a = str;
        this.b = str2;
        this.c = xkg0Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx2)) {
            return false;
        }
        jx2 jx2Var = (jx2) obj;
        return this.a.equals(jx2Var.a) && this.b.equals(jx2Var.b) && this.c.equals(jx2Var.c) && this.d.equals(jx2Var.d) && u890.j(this.e, jx2Var.e) && u890.j(this.f, jx2Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(kk0.h(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
