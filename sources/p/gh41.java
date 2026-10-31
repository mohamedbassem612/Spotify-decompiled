package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gh41 {
    public final iix0 a;

    public gh41(iix0 iix0Var) {
        this.a = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh41) && u890.j(this.a, ((gh41) obj).a);
    }

    public final int hashCode() {
        iix0 iix0Var = this.a;
        if (iix0Var == null) {
            return 0;
        }
        return iix0Var.hashCode();
    }
}
