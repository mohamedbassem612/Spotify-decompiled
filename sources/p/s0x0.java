package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s0x0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final d8r0 g;
    public final int h;

    public s0x0(String str, String str2, String str3, String str4, boolean z, String str5, d8r0 d8r0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = d8r0Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0x0)) {
            return false;
        }
        s0x0 s0x0Var = (s0x0) obj;
        return u890.j(this.a, s0x0Var.a) && u890.j(this.b, s0x0Var.b) && u890.j(this.c, s0x0Var.c) && u890.j(this.d, s0x0Var.d) && this.e == s0x0Var.e && u890.j(this.f, s0x0Var.f) && this.g.equals(s0x0Var.g) && this.h == s0x0Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + hrt.i(this.g, cy30.d(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}
