package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ssd extends n3o1 {
    public final ouo1 c;

    public ssd(ouo1 ouo1Var) {
        this.c = ouo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssd) && this.c.equals(((ssd) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
