package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pqm1 extends eqn1 {
    public final tv80 d;

    public pqm1(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqm1) && u890.j(this.d, ((pqm1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
