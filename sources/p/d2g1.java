package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d2g1 {
    public final String a;
    public final String b;
    public final int c;
    public final d8r0 d;
    public final String e;
    public final c380 f;

    public d2g1(String str, String str2, int i, d8r0 d8r0Var, String str3, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = d8r0Var;
        this.e = str3;
        this.f = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2g1)) {
            return false;
        }
        d2g1 d2g1Var = (d2g1) obj;
        return u890.j(this.a, d2g1Var.a) && u890.j(this.b, d2g1Var.b) && this.c == d2g1Var.c && this.d.equals(d2g1Var.d) && u890.j(this.e, d2g1Var.e) && u890.j(this.f, d2g1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(hrt.i(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }
}
