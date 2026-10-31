package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class snh0 implements wnh0 {
    public final vy30 a;

    public snh0(vy30 vy30Var) {
        this.a = vy30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snh0) && u890.j(this.a, ((snh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
