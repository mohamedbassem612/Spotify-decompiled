package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uqg0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uqg0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqg0)) {
            return false;
        }
        uqg0 uqg0Var = (uqg0) obj;
        return this.a == uqg0Var.a && this.b == uqg0Var.b && this.c == uqg0Var.c && this.d == uqg0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
