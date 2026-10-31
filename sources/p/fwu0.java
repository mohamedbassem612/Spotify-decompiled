package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fwu0 {
    public final long a;
    public final int b;
    public final ewu0 c;

    public fwu0(long j, int i, ewu0 ewu0Var) {
        this.a = j;
        this.b = i;
        this.c = ewu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwu0)) {
            return false;
        }
        fwu0 fwu0Var = (fwu0) obj;
        return this.a == fwu0Var.a && this.b == fwu0Var.b && this.c == fwu0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
