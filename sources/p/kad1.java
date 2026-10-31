package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kad1 {
    public final int a;
    public final long b;

    public kad1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kad1)) {
            return false;
        }
        kad1 kad1Var = (kad1) obj;
        return this.a == kad1Var.a && this.b == kad1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
