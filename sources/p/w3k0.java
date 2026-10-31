package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w3k0 implements k4k0 {
    public final String a;
    public final String b;
    public final double c;
    public final String d;
    public final nig1 e;
    public final uia f;
    public final int g;
    public final Float h;

    public w3k0(String str, String str2, double d, String str3, nig1 nig1Var, uia uiaVar, int i, Float f) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = nig1Var;
        this.f = uiaVar;
        this.g = i;
        this.h = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3k0)) {
            return false;
        }
        w3k0 w3k0Var = (w3k0) obj;
        return u890.j(this.a, w3k0Var.a) && u890.j(this.b, w3k0Var.b) && Double.compare(this.c, w3k0Var.c) == 0 && u890.j(this.d, w3k0Var.d) && u890.j(this.e, w3k0Var.e) && u890.j(this.f, w3k0Var.f) && this.g == w3k0Var.g && u890.j(this.h, w3k0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = xcg1.e(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iE + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        uia uiaVar = this.f;
        int iF = kaa0.f(this.g, (iHashCode2 + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31, 31);
        Float f = this.h;
        return iF + (f != null ? f.hashCode() : 0);
    }
}
