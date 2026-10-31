package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fvh1 {
    public final String a;
    public final String b;
    public final xk41 c;
    public final String d;
    public final String e;
    public final Boolean f;
    public final u1f1 g;
    public final String h;

    public fvh1(String str, String str2, xk41 xk41Var, String str3, String str4, Boolean bool, u1f1 u1f1Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = xk41Var;
        this.d = str3;
        this.e = str4;
        this.f = bool;
        this.g = u1f1Var;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvh1)) {
            return false;
        }
        fvh1 fvh1Var = (fvh1) obj;
        return u890.j(this.a, fvh1Var.a) && u890.j(this.b, fvh1Var.b) && u890.j(this.c, fvh1Var.c) && u890.j(this.d, fvh1Var.d) && u890.j(this.e, fvh1Var.e) && u890.j(this.f, fvh1Var.f) && u890.j(this.g, fvh1Var.g) && u890.j(this.h, fvh1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        xk41 xk41Var = this.c;
        int iHashCode = (iD + (xk41Var == null ? 0 : xk41Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        u1f1 u1f1Var = this.g;
        int iHashCode5 = (iHashCode4 + (u1f1Var == null ? 0 : u1f1Var.a.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ fvh1(String str, String str2, xk41 xk41Var, Boolean bool) {
        this(str, str2, xk41Var, null, null, bool, null, null);
    }
}
