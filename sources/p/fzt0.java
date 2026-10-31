package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fzt0 implements lzt0 {
    public final int a;
    public final long b;

    public fzt0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzt0)) {
            return false;
        }
        fzt0 fzt0Var = (fzt0) obj;
        return this.a == fzt0Var.a && this.b == fzt0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
