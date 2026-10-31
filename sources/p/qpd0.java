package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpd0 {
    public final long a;
    public final boolean b;

    public qpd0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpd0)) {
            return false;
        }
        qpd0 qpd0Var = (qpd0) obj;
        return this.a == qpd0Var.a && this.b == qpd0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public /* synthetic */ qpd0() {
        this(0L, true);
    }
}
