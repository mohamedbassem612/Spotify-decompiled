package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pao0 {
    public final ak3 a;

    public pao0(ak3 ak3Var) {
        this.a = ak3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pao0) && this.a == ((pao0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
