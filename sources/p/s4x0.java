package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s4x0 extends i541 {
    public final tv80 d;

    public s4x0(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4x0) && u890.j(this.d, ((s4x0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
