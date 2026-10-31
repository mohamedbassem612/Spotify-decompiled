package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dh20 extends c2p1 {
    public final pap1 c;

    public dh20(pap1 pap1Var) {
        this.c = pap1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh20) && this.c.equals(((dh20) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
