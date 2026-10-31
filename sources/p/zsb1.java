package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zsb1 implements btb1 {
    public final xsb1 a;
    public final String b;
    public final d761 c;
    public final String d;
    public final xxh e;
    public final String f;
    public final int g;
    public final String h;

    public zsb1(xsb1 xsb1Var, String str, d761 d761Var, String str2, xxh xxhVar, String str3, int i, String str4) {
        this.a = xsb1Var;
        this.b = str;
        this.c = d761Var;
        this.d = str2;
        this.e = xxhVar;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsb1)) {
            return false;
        }
        zsb1 zsb1Var = (zsb1) obj;
        return this.a == zsb1Var.a && u890.j(this.b, zsb1Var.b) && u890.j(this.c, zsb1Var.c) && u890.j(this.d, zsb1Var.d) && u890.j(this.e, zsb1Var.e) && u890.j(this.f, zsb1Var.f) && this.g == zsb1Var.g && u890.j(this.h, zsb1Var.h);
    }

    public final int hashCode() {
        int iF = ktd.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c.a, 31);
        String str = this.d;
        int iK = ab80.k(this.g, cy30.d((this.e.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31);
        String str2 = this.h;
        return iK + (str2 != null ? str2.hashCode() : 0);
    }
}
