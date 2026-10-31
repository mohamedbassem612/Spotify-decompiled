package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oje0 extends d9p1 {
    public final nhe0 c;

    public oje0(nhe0 nhe0Var) {
        this.c = nhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oje0) && u890.j(this.c, ((oje0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
