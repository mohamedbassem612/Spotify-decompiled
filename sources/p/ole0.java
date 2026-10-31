package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ole0 extends gme0 {
    public final nhe0 a;

    public ole0(nhe0 nhe0Var) {
        this.a = nhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ole0) && this.a.equals(((ole0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
