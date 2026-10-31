package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l070 implements q070 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Float e;
    public final Float f;

    public l070(String str, int i, int i2, int i3, Float f, Float f2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l070)) {
            return false;
        }
        l070 l070Var = (l070) obj;
        return this.a.equals(l070Var.a) && this.b == l070Var.b && this.c == l070Var.c && this.d == l070Var.d && u890.j(this.e, l070Var.e) && u890.j(this.f, l070Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
        Float f = this.e;
        int iHashCode = (iK + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
