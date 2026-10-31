package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fa60 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fa60(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa60)) {
            return false;
        }
        fa60 fa60Var = (fa60) obj;
        return this.a == fa60Var.a && this.b == fa60Var.b && this.c == fa60Var.c && this.d == fa60Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
