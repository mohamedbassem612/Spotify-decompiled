package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x8i0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;

    public x8i0(int i, int i2, int i3, int i4, String str, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8i0)) {
            return false;
        }
        x8i0 x8i0Var = (x8i0) obj;
        return u890.j(this.a, x8i0Var.a) && this.b == x8i0Var.b && this.c == x8i0Var.c && u890.j(this.d, x8i0Var.d) && this.e == x8i0Var.e && this.f == x8i0Var.f;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return Integer.hashCode(this.f) + kaa0.f(this.e, (iF + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
