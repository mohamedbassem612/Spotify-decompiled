package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ext0 {
    public final Boolean a;
    public final ktl b;

    public ext0(Boolean bool, ktl ktlVar) {
        this.a = bool;
        this.b = ktlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ext0)) {
            return false;
        }
        ext0 ext0Var = (ext0) obj;
        return u890.j(this.a, ext0Var.a) && this.b == ext0Var.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ktl ktlVar = this.b;
        return iHashCode + (ktlVar != null ? ktlVar.hashCode() : 0);
    }
}
