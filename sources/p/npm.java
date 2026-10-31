package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class npm {
    public final ufh a;
    public final oxz0 b;

    public npm(ufh ufhVar, oxz0 oxz0Var) {
        this.a = ufhVar;
        this.b = oxz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npm)) {
            return false;
        }
        npm npmVar = (npm) obj;
        return u890.j(this.a, npmVar.a) && u890.j(this.b, npmVar.b);
    }

    public final int hashCode() {
        ufh ufhVar = this.a;
        int iHashCode = (ufhVar == null ? 0 : ufhVar.hashCode()) * 31;
        oxz0 oxz0Var = this.b;
        return iHashCode + (oxz0Var != null ? oxz0Var.hashCode() : 0);
    }
}
