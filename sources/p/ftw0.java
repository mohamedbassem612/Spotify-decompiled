package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ftw0 {
    public final String a;
    public final double b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final wui1 g;
    public final int h;

    public ftw0(String str, double d, String str2, String str3, String str4, String str5, wui1 wui1Var, int i) {
        this.a = str;
        this.b = d;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = wui1Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftw0)) {
            return false;
        }
        ftw0 ftw0Var = (ftw0) obj;
        return this.a.equals(ftw0Var.a) && Double.compare(this.b, ftw0Var.b) == 0 && this.c.equals(ftw0Var.c) && this.d.equals(ftw0Var.d) && u890.j(this.e, ftw0Var.e) && this.f.equals(ftw0Var.f) && u890.j(this.g, ftw0Var.g) && this.h == ftw0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(xcg1.e(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        wui1 wui1Var = this.g;
        return Integer.hashCode(this.h) + ((iD2 + (wui1Var != null ? Double.hashCode(wui1Var.a) : 0)) * 31);
    }
}
