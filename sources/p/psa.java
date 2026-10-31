package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class psa extends ucp1 {
    public final t2d1 d;

    public psa(t2d1 t2d1Var) {
        this.d = t2d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psa) && u890.j(this.d, ((psa) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
