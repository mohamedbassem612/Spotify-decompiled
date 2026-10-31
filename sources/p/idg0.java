package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class idg0 {
    public final jbg0 a;
    public final ibg0 b;

    public idg0(jbg0 jbg0Var, ibg0 ibg0Var) {
        this.a = jbg0Var;
        this.b = ibg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idg0)) {
            return false;
        }
        idg0 idg0Var = (idg0) obj;
        return this.a.equals(idg0Var.a) && this.b == idg0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
