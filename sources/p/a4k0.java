package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a4k0 implements k4k0 {
    public final int a;
    public final boolean b;
    public final int c;

    public a4k0(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4k0)) {
            return false;
        }
        a4k0 a4k0Var = (a4k0) obj;
        return this.a == a4k0Var.a && this.b == a4k0Var.b && this.c == a4k0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
