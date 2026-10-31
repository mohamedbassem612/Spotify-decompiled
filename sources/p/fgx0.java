package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fgx0 {
    public final int a;
    public final int b;
    public final long c;

    public fgx0(int i, long j, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgx0)) {
            return false;
        }
        fgx0 fgx0Var = (fgx0) obj;
        return this.a == fgx0Var.a && this.b == fgx0Var.b && this.c == fgx0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ab80.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
