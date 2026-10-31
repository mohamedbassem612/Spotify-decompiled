package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mjw0 implements njw0 {
    public final z6j1 a;
    public final ojw0 b;

    public mjw0(z6j1 z6j1Var, ojw0 ojw0Var) {
        this.a = z6j1Var;
        this.b = ojw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjw0)) {
            return false;
        }
        mjw0 mjw0Var = (mjw0) obj;
        return this.a.equals(mjw0Var.a) && u890.j(this.b, mjw0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ojw0 ojw0Var = this.b;
        return iHashCode + (ojw0Var == null ? 0 : ojw0Var.hashCode());
    }
}
