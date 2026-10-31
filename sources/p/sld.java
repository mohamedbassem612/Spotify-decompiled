package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sld implements uld {
    public final ttw0 a;

    public sld(ttw0 ttw0Var) {
        this.a = ttw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sld) && u890.j(this.a, ((sld) obj).a);
    }

    public final int hashCode() {
        ttw0 ttw0Var = this.a;
        if (ttw0Var == null) {
            return 0;
        }
        return ttw0Var.hashCode();
    }
}
