package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fvl implements cwl {
    public final so80 a;

    public fvl(so80 so80Var) {
        this.a = so80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvl) && this.a.equals(((fvl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
