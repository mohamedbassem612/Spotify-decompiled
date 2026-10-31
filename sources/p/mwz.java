package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mwz implements w600 {
    public final tka0 a;

    public mwz(tka0 tka0Var) {
        this.a = tka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwz) && u890.j(this.a, ((mwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
