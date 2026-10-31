package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ici0 {
    public final t810 a;
    public final iix0 b;

    public ici0(t810 t810Var, iix0 iix0Var) {
        this.a = t810Var;
        this.b = iix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ici0)) {
            return false;
        }
        ici0 ici0Var = (ici0) obj;
        return u890.j(this.a, ici0Var.a) && u890.j(this.b, ici0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iix0 iix0Var = this.b;
        return iHashCode + (iix0Var == null ? 0 : iix0Var.hashCode());
    }
}
