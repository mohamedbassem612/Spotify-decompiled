package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qxt0 implements zxt0 {
    public final y6b1 a;
    public final long b;

    public qxt0(y6b1 y6b1Var, long j) {
        this.a = y6b1Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxt0)) {
            return false;
        }
        qxt0 qxt0Var = (qxt0) obj;
        return this.a.equals(qxt0Var.a) && this.b == qxt0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
