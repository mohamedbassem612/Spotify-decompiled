package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ssd1 implements tsd1 {
    public final boolean a;
    public final int b;
    public final String c;
    public final String d;
    public final ksd1 e;
    public final String f;
    public final String g;
    public final afx h;

    public ssd1(boolean z, int i, String str, String str2, ksd1 ksd1Var, String str3, String str4, afx afxVar) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = ksd1Var;
        this.f = str3;
        this.g = str4;
        this.h = afxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssd1)) {
            return false;
        }
        ssd1 ssd1Var = (ssd1) obj;
        return this.a == ssd1Var.a && this.b == ssd1Var.b && u890.j(this.c, ssd1Var.c) && u890.j(this.d, ssd1Var.d) && this.e == ssd1Var.e && u890.j(this.f, ssd1Var.f) && u890.j(this.g, ssd1Var.g) && u890.j(this.h, ssd1Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        afx afxVar = this.h;
        return iHashCode3 + (afxVar != null ? afxVar.hashCode() : 0);
    }
}
