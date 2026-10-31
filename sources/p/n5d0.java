package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n5d0 implements ez00 {
    public final int a;
    public final int b;
    public final b290 c;
    public final int d;

    public n5d0(int i, int i2, b290 b290Var) {
        int size = (b290Var.size() * i2) + i;
        this.a = i;
        this.b = i2;
        this.c = b290Var;
        this.d = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5d0)) {
            return false;
        }
        n5d0 n5d0Var = (n5d0) obj;
        return this.a == n5d0Var.a && this.b == n5d0Var.b && this.c.equals(n5d0Var.c) && this.d == n5d0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }
}
