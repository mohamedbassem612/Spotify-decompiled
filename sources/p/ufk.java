package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ufk extends nln {
    public final g3p1 e;

    public ufk(g3p1 g3p1Var) {
        super((byte) 4);
        this.e = g3p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufk) && this.e.equals(((ufk) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
