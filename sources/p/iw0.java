package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iw0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public iw0(int i, int i2, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return u890.j(this.a, iw0Var.a) && this.b == iw0Var.b && this.c == iw0Var.c && this.d == iw0Var.d && this.e == iw0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
