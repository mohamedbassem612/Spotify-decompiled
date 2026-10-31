package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pje1 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final oje1 g;
    public final String h;

    public pje1(String str, int i, int i2, int i3, String str2, String str3, oje1 oje1Var, String str4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = oje1Var;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pje1)) {
            return false;
        }
        pje1 pje1Var = (pje1) obj;
        return this.a.equals(pje1Var.a) && this.b == pje1Var.b && this.c == pje1Var.c && this.d == pje1Var.d && this.e.equals(pje1Var.e) && this.f.equals(pje1Var.f) && u890.j(this.g, pje1Var.g) && u890.j(this.h, pje1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(ab80.k(this.d, kaa0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
        oje1 oje1Var = this.g;
        int iHashCode = (iD + (oje1Var == null ? 0 : oje1Var.hashCode())) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
