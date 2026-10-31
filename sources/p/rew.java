package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rew implements niw {
    public final String a;
    public final rz21 b;

    public rew(String str, rz21 rz21Var) {
        this.a = str;
        this.b = rz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rew)) {
            return false;
        }
        rew rewVar = (rew) obj;
        return u890.j(this.a, rewVar.a) && u890.j(this.b, rewVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rz21 rz21Var = this.b;
        return iHashCode + (rz21Var == null ? 0 : rz21Var.hashCode());
    }
}
