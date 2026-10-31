package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qlw0 implements ulw0 {
    public final long a;
    public final long b;

    public qlw0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlw0)) {
            return false;
        }
        qlw0 qlw0Var = (qlw0) obj;
        return this.a == qlw0Var.a && this.b == qlw0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
