package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z8t0 {
    public final String a;
    public final String b;
    public final String c;
    public final sto1 d;
    public final int e;
    public final boolean f;

    public z8t0(String str, String str2, String str3, sto1 sto1Var, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sto1Var;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8t0)) {
            return false;
        }
        z8t0 z8t0Var = (z8t0) obj;
        return this.a.equals(z8t0Var.a) && this.b.equals(z8t0Var.b) && this.c.equals(z8t0Var.c) && this.d.equals(z8t0Var.d) && this.e == z8t0Var.e && this.f == z8t0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kaa0.f(this.e, (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
    }
}
