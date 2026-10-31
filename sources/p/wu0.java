package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wu0 {
    public final int a;
    public final int b;
    public final int c;

    public wu0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0)) {
            return false;
        }
        wu0 wu0Var = (wu0) obj;
        return this.a == wu0Var.a && this.b == wu0Var.b && this.c == wu0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
