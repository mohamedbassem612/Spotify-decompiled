package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lrz0 {
    public final int a;
    public final int b;
    public final int c;

    public /* synthetic */ lrz0(int i, int i2, int i3, int i4) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrz0)) {
            return false;
        }
        lrz0 lrz0Var = (lrz0) obj;
        return this.a == lrz0Var.a && this.b == lrz0Var.b && this.c == lrz0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public lrz0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
