package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e441 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public e441(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e441)) {
            return false;
        }
        e441 e441Var = (e441) obj;
        return this.a == e441Var.a && this.b == e441Var.b && this.c == e441Var.c && this.d == e441Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
