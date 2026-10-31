package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dqc0 implements gqc0 {
    public final rnc0 a;

    public dqc0(rnc0 rnc0Var) {
        this.a = rnc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqc0) && u890.j(this.a, ((dqc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
