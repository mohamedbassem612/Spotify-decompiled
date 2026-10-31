package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x8b0 {
    public final int a;
    public final int b;
    public final int c;

    public x8b0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8b0)) {
            return false;
        }
        x8b0 x8b0Var = (x8b0) obj;
        return this.a == x8b0Var.a && this.b == x8b0Var.b && this.c == x8b0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
