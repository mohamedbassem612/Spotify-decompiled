package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fau extends gau {
    public final bal1 a;

    public fau(bal1 bal1Var) {
        this.a = bal1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fau) && this.a.equals(((fau) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
