package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sru0 {
    public final tsu0 a;

    public sru0(tsu0 tsu0Var) {
        this.a = tsu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sru0) && this.a.equals(((sru0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
