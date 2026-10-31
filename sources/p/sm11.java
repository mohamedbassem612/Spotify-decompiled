package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sm11 {
    public final String a;
    public final int b;
    public final String c;
    public final d8r0 d;
    public final String e;
    public final int f;
    public final String g;

    public sm11(String str, int i, String str2, d8r0 d8r0Var, String str3, int i2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = d8r0Var;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm11)) {
            return false;
        }
        sm11 sm11Var = (sm11) obj;
        return u890.j(this.a, sm11Var.a) && this.b == sm11Var.b && u890.j(this.c, sm11Var.c) && this.d.equals(sm11Var.d) && u890.j(this.e, sm11Var.e) && this.f == sm11Var.f && u890.j(this.g, sm11Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(this.f, cy30.d(hrt.i(this.d, cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31);
    }
}
