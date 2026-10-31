package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j7j1 implements o7j1 {
    public final ji0 a;
    public final long b;

    public j7j1(ji0 ji0Var, long j) {
        this.a = ji0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7j1)) {
            return false;
        }
        j7j1 j7j1Var = (j7j1) obj;
        return u890.j(this.a, j7j1Var.a) && this.b == j7j1Var.b;
    }

    public final int hashCode() {
        ji0 ji0Var = this.a;
        return Long.hashCode(this.b) + ((ji0Var == null ? 0 : ji0Var.hashCode()) * 31);
    }
}
