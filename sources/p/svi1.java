package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svi1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final d8r0 e;
    public final String f;
    public final int g;
    public final Integer h;
    public final String i;

    public svi1(String str, String str2, String str3, String str4, d8r0 d8r0Var, String str5, int i, Integer num, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d8r0Var;
        this.f = str5;
        this.g = i;
        this.h = num;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi1)) {
            return false;
        }
        svi1 svi1Var = (svi1) obj;
        return u890.j(this.a, svi1Var.a) && u890.j(this.b, svi1Var.b) && u890.j(this.c, svi1Var.c) && u890.j(this.d, svi1Var.d) && this.e.equals(svi1Var.e) && u890.j(this.f, svi1Var.f) && this.g == svi1Var.g && u890.j(this.h, svi1Var.h) && u890.j(this.i, svi1Var.i);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.g, cy30.d(hrt.i(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31);
        Integer num = this.h;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
