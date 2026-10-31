package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ule0 extends gme0 {
    public final nhe0 a;

    public ule0(nhe0 nhe0Var) {
        this.a = nhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ule0) && u890.j(this.a, ((ule0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
