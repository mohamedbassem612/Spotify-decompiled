package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wvp0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final d8r0 h;
    public final int i;

    public wvp0(String str, String str2, String str3, String str4, int i, int i2, boolean z, d8r0 d8r0Var, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = d8r0Var;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvp0)) {
            return false;
        }
        wvp0 wvp0Var = (wvp0) obj;
        return u890.j(this.a, wvp0Var.a) && u890.j(this.b, wvp0Var.b) && u890.j(this.c, wvp0Var.c) && u890.j(this.d, wvp0Var.d) && this.e == wvp0Var.e && this.f == wvp0Var.f && this.g == wvp0Var.g && this.h.equals(wvp0Var.h) && this.i == wvp0Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.i) + hrt.i(this.h, xcg1.g(ab80.k(this.f, ab80.k(this.e, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.g), 31);
    }
}
