package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t4x0 extends i541 {
    public final z6x0 d;
    public final tv80 e;

    public t4x0(z6x0 z6x0Var, tv80 tv80Var) {
        this.d = z6x0Var;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4x0)) {
            return false;
        }
        t4x0 t4x0Var = (t4x0) obj;
        return this.d.equals(t4x0Var.d) && u890.j(this.e, t4x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
