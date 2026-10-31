package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h2e1 extends l2p1 {
    public final u771 c;

    public h2e1(u771 u771Var) {
        this.c = u771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2e1) && u890.j(this.c, ((h2e1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
