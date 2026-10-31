package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swu0 {
    public final int a;
    public final long b;

    public swu0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swu0)) {
            return false;
        }
        swu0 swu0Var = (swu0) obj;
        return this.a == swu0Var.a && this.b == swu0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
