package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sx71 implements vx71 {
    public final long a;
    public final int b;

    public sx71(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx71)) {
            return false;
        }
        sx71 sx71Var = (sx71) obj;
        return this.a == sx71Var.a && this.b == sx71Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Long.hashCode(this.a) * 31);
    }
}
