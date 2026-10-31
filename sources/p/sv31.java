package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sv31 implements aw31 {
    public final int a;
    public final int b;
    public final String c;
    public final z0e1 d;
    public final boolean e;

    public sv31(int i, int i2, String str, z0e1 z0e1Var, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = z0e1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv31)) {
            return false;
        }
        sv31 sv31Var = (sv31) obj;
        return this.a == sv31Var.a && this.b == sv31Var.b && u890.j(this.c, sv31Var.c) && this.d.equals(sv31Var.d) && this.e == sv31Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31);
    }

    public final int p() {
        return this.a;
    }
}
