package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xib0 {
    public final wib0 a;
    public final jo70 b;
    public final xkk1 c;
    public final String d;
    public final vlw0 e;
    public final boolean f;
    public final boolean g;

    public xib0(wib0 wib0Var, jo70 jo70Var, xkk1 xkk1Var, String str, vlw0 vlw0Var, boolean z, boolean z2) {
        this.a = wib0Var;
        this.b = jo70Var;
        this.c = xkk1Var;
        this.d = str;
        this.e = vlw0Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xib0)) {
            return false;
        }
        xib0 xib0Var = (xib0) obj;
        return this.a.equals(xib0Var.a) && u890.j(this.b, xib0Var.b) && u890.j(this.c, xib0Var.c) && u890.j(this.d, xib0Var.d) && u890.j(this.e, xib0Var.e) && this.f == xib0Var.f && this.g == xib0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g((this.e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f);
    }
}
