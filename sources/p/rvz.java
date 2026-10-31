package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rvz implements k700 {
    public final k12 a;

    public rvz(k12 k12Var) {
        this.a = k12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvz) && this.a == ((rvz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
