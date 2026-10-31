package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ocz implements qcz {
    public final i091 a;

    public ocz(i091 i091Var) {
        this.a = i091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocz) && this.a.equals(((ocz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
