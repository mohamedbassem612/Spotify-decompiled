package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kzf1 {
    public final String a;
    public final int b;
    public final gzf1 c;
    public final boolean d;
    public final boolean e;
    public final iu30 f;

    public kzf1(String str, int i, gzf1 gzf1Var, boolean z, boolean z2, iu30 iu30Var) {
        this.a = str;
        this.b = i;
        this.c = gzf1Var;
        this.d = z;
        this.e = z2;
        this.f = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzf1)) {
            return false;
        }
        kzf1 kzf1Var = (kzf1) obj;
        return this.a.equals(kzf1Var.a) && this.b == kzf1Var.b && this.c.equals(kzf1Var.c) && this.d == kzf1Var.d && this.e == kzf1Var.e && this.f.equals(kzf1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
    }
}
