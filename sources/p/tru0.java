package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tru0 {
    public final tsu0 a;

    public tru0(tsu0 tsu0Var) {
        this.a = tsu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tru0) && this.a.equals(((tru0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
