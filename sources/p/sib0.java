package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sib0 implements uib0 {
    public final xib0 a;

    public sib0(xib0 xib0Var) {
        this.a = xib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sib0) && u890.j(this.a, ((sib0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
