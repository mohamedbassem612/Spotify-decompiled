package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i070 implements q070 {
    public final String a;
    public final int b;
    public final int c;
    public final Float d;
    public final Float e;

    public i070(String str, int i, int i2, Float f, Float f2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i070)) {
            return false;
        }
        i070 i070Var = (i070) obj;
        return this.a.equals(i070Var.a) && this.b == i070Var.b && this.c == i070Var.c && u890.j(this.d, i070Var.d) && u890.j(this.e, i070Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
        Float f = this.d;
        int iHashCode = (iK + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.e;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
