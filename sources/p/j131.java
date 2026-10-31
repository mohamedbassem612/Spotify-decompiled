package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j131 implements k131 {
    public final ewt0 a;

    public j131(ewt0 ewt0Var) {
        this.a = ewt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j131) && this.a == ((j131) obj).a;
    }

    public final int hashCode() {
        ewt0 ewt0Var = this.a;
        if (ewt0Var == null) {
            return 0;
        }
        return ewt0Var.hashCode();
    }
}
