package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uqm1 extends eqn1 {
    public final pr61 d;

    public uqm1(pr61 pr61Var) {
        this.d = pr61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqm1) && this.d.equals(((uqm1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
