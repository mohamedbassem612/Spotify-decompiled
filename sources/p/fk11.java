package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fk11 implements hk11 {
    public final String a;
    public final String b;
    public final String c;
    public final c380 d;
    public final Double e;
    public final String f;
    public final jfv g;
    public final String h;
    public final String i;

    public fk11(String str, String str2, String str3, c380 c380Var, Double d, String str4, jfv jfvVar, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c380Var;
        this.e = d;
        this.f = str4;
        this.g = jfvVar;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk11)) {
            return false;
        }
        fk11 fk11Var = (fk11) obj;
        return u890.j(this.a, fk11Var.a) && u890.j(this.b, fk11Var.b) && u890.j(this.c, fk11Var.c) && u890.j(this.d, fk11Var.d) && u890.j(this.e, fk11Var.e) && u890.j(this.f, fk11Var.f) && u890.j(this.g, fk11Var.g) && u890.j(this.h, fk11Var.h) && u890.j(this.i, fk11Var.i);
    }

    public final int hashCode() {
        int iF = kk0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        Double d = this.e;
        int iHashCode = (iF + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jfv jfvVar = this.g;
        int iHashCode3 = (iHashCode2 + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a))) * 31;
        String str2 = this.h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
