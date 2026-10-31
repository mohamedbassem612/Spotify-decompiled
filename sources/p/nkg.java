package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nkg {
    public final String a;
    public final c380 b;
    public final String c;
    public final d8r0 d;
    public final String e;
    public final int f;
    public final boolean g;

    public nkg(String str, c380 c380Var, String str2, d8r0 d8r0Var, String str3, int i, boolean z) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
        this.d = d8r0Var;
        this.e = str3;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkg)) {
            return false;
        }
        nkg nkgVar = (nkg) obj;
        return u890.j(this.a, nkgVar.a) && u890.j(this.b, nkgVar.b) && u890.j(this.c, nkgVar.c) && this.d.equals(nkgVar.d) && this.e.equals(nkgVar.e) && this.f == nkgVar.f && this.g == nkgVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ab80.k(this.f, cy30.d(hrt.i(this.d, cy30.d(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31);
    }
}
