package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class anf1 {
    public final ji0 a;
    public final uuw b;

    public anf1(ji0 ji0Var, uuw uuwVar) {
        this.a = ji0Var;
        this.b = uuwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anf1)) {
            return false;
        }
        anf1 anf1Var = (anf1) obj;
        return u890.j(this.a, anf1Var.a) && u890.j(this.b, anf1Var.b);
    }

    public final int hashCode() {
        ji0 ji0Var = this.a;
        return this.b.hashCode() + ((ji0Var == null ? 0 : ji0Var.hashCode()) * 31);
    }
}
