package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pok0 {
    public final bxt a;
    public final iwc1 b;

    public pok0(bxt bxtVar, iwc1 iwc1Var) {
        this.a = bxtVar;
        this.b = iwc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pok0)) {
            return false;
        }
        pok0 pok0Var = (pok0) obj;
        return u890.j(this.a, pok0Var.a) && this.b == pok0Var.b;
    }

    public final int hashCode() {
        bxt bxtVar = this.a;
        return this.b.hashCode() + ((bxtVar == null ? 0 : bxtVar.hashCode()) * 31);
    }
}
