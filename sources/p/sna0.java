package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sna0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final d8r0 h;
    public final int i;
    public final int j;

    public sna0(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, d8r0 d8r0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = d8r0Var;
        this.i = i2;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sna0)) {
            return false;
        }
        sna0 sna0Var = (sna0) obj;
        return u890.j(this.a, sna0Var.a) && u890.j(this.b, sna0Var.b) && u890.j(this.c, sna0Var.c) && this.d == sna0Var.d && u890.j(this.e, sna0Var.e) && this.f == sna0Var.f && u890.j(this.g, sna0Var.g) && this.h.equals(sna0Var.h) && this.i == sna0Var.i && this.j == sna0Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.j) + ab80.k(this.i, hrt.i(this.h, cy30.d(ab80.k(this.f, cy30.d(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31), 31);
    }
}
