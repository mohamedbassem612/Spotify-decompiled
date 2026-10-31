package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n900 {
    public final int a;
    public final long b;

    public n900(int i, long j) {
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
        if (!(obj instanceof n900)) {
            return false;
        }
        n900 n900Var = (n900) obj;
        return this.a == n900Var.a && this.b == n900Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
