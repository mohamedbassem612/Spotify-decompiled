package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qc00 {
    public long a;
    public long b;

    public qc00(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final void c(long j) {
        this.b = j;
    }

    public final void d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc00)) {
            return false;
        }
        qc00 qc00Var = (qc00) obj;
        return this.a == qc00Var.a && this.b == qc00Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public /* synthetic */ qc00() {
        this(0L, 0L);
    }
}
