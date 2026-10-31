package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b7v0 {
    public final int a;
    public final boolean b;
    public final int c;

    public b7v0(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7v0)) {
            return false;
        }
        b7v0 b7v0Var = (b7v0) obj;
        return this.a == b7v0Var.a && this.b == b7v0Var.b && this.c == b7v0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(l1d.C(this.a) * 31, 31, this.b);
    }
}
