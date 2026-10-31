package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fwi0 {
    public final ywi0 a;
    public final String b;
    public final String c;
    public final vvi0 d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public fwi0(ywi0 ywi0Var, String str, String str2, vvi0 vvi0Var, int i) {
        vvi0Var = (i & 8) != 0 ? bj20.O0 : vvi0Var;
        int i2 = (i & 16) != 0 ? 1 : 3;
        boolean z = (i & 32) != 0;
        boolean z2 = (i & 64) != 0;
        this.a = ywi0Var;
        this.b = str;
        this.c = str2;
        this.d = vvi0Var;
        this.e = i2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwi0)) {
            return false;
        }
        fwi0 fwi0Var = (fwi0) obj;
        return this.a == fwi0Var.a && this.b.equals(fwi0Var.b) && this.c.equals(fwi0Var.c) && this.d.equals(fwi0Var.d) && this.e == fwi0Var.e && this.f == fwi0Var.f && this.g == fwi0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(ab80.k(this.e, (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f);
    }
}
