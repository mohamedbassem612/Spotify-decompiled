package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qpf1 {
    public final ppf1 a;
    public final mpf1 b;

    public qpf1(ppf1 ppf1Var, mpf1 mpf1Var) {
        this.a = ppf1Var;
        this.b = mpf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpf1)) {
            return false;
        }
        qpf1 qpf1Var = (qpf1) obj;
        return this.a.equals(qpf1Var.a) && this.b.equals(qpf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
