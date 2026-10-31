package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bwd1 {
    public final int a;
    public final int b;
    public final int c;

    public bwd1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwd1)) {
            return false;
        }
        bwd1 bwd1Var = (bwd1) obj;
        return this.a == bwd1Var.a && this.b == bwd1Var.b && this.c == bwd1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
