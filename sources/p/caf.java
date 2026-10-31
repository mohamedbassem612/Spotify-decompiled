package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class caf {
    public final vba0 a;

    public caf(vba0 vba0Var) {
        this.a = vba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caf) && this.a.equals(((caf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
