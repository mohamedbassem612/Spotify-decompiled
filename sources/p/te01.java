package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class te01 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public te01(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static te01 a(te01 te01Var, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = te01Var.a;
        }
        if ((i4 & 2) != 0) {
            i2 = te01Var.b;
        }
        if ((i4 & 4) != 0) {
            i3 = te01Var.c;
        }
        return new te01(i, i2, i3, (i4 & 8) != 0 ? te01Var.d : 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te01)) {
            return false;
        }
        te01 te01Var = (te01) obj;
        return this.a == te01Var.a && this.b == te01Var.b && this.c == te01Var.c && this.d == te01Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
