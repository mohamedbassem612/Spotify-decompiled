package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class feu implements e9j1 {
    public final fq0 a;
    public final boolean b;

    public feu(fq0 fq0Var, boolean z) {
        this.a = fq0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof feu)) {
            return false;
        }
        feu feuVar = (feu) obj;
        return u890.j(this.a, feuVar.a) && this.b == feuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
