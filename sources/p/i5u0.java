package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5u0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final String e;

    public i5u0(int i, int i2, int i3, long j, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5u0)) {
            return false;
        }
        i5u0 i5u0Var = (i5u0) obj;
        return this.a == i5u0Var.a && this.b == i5u0Var.b && this.c == i5u0Var.c && this.d == i5u0Var.d && u890.j(this.e, i5u0Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f(kaa0.f(this.c, kaa0.f(this.b, l1d.C(this.a) * 31, 31), 31), this.d, 31);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
