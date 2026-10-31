package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n0n1 extends ern1 {
    public final oqn1 c;

    public n0n1(oqn1 oqn1Var) {
        this.c = oqn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0n1) && this.c.equals(((n0n1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
