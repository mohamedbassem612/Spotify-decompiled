package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xy31 {
    public final int a;
    public final long b;
    public final int c;

    public xy31(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy31)) {
            return false;
        }
        xy31 xy31Var = (xy31) obj;
        return this.a == xy31Var.a && this.b == xy31Var.b && this.c == xy31Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }
}
