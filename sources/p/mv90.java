package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mv90 {
    public final lu90 a;
    public final f4s b;

    public mv90(lu90 lu90Var, f4s f4sVar) {
        this.a = lu90Var;
        this.b = f4sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv90)) {
            return false;
        }
        mv90 mv90Var = (mv90) obj;
        return this.a.equals(mv90Var.a) && u890.j(this.b, mv90Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        f4s f4sVar = this.b;
        return iHashCode + (f4sVar == null ? 0 : f4sVar.hashCode());
    }
}
