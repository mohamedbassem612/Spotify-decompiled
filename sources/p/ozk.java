package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ozk {
    public final String a;
    public final xk41 b;
    public final z681 c;
    public final String d;
    public final u1f1 e;
    public final r591 f;
    public final boolean g;
    public final String h;

    public ozk(String str, xk41 xk41Var, z681 z681Var, String str2, u1f1 u1f1Var, r591 r591Var, boolean z, String str3) {
        this.a = str;
        this.b = xk41Var;
        this.c = z681Var;
        this.d = str2;
        this.e = u1f1Var;
        this.f = r591Var;
        this.g = z;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozk)) {
            return false;
        }
        ozk ozkVar = (ozk) obj;
        return u890.j(this.a, ozkVar.a) && this.b.equals(ozkVar.b) && this.c.equals(ozkVar.c) && u890.j(this.d, ozkVar.d) && u890.j(this.e, ozkVar.e) && this.f == ozkVar.f && this.g == ozkVar.g && u890.j(this.h, ozkVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u1f1 u1f1Var = this.e;
        int iHashCode3 = (iHashCode2 + (u1f1Var == null ? 0 : u1f1Var.a.hashCode())) * 31;
        r591 r591Var = this.f;
        int iG = xcg1.g((iHashCode3 + (r591Var == null ? 0 : r591Var.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
