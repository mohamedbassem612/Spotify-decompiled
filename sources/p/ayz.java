package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ayz implements y600 {
    public final tcs0 a;
    public final iz21 b;

    public ayz(tcs0 tcs0Var, iz21 iz21Var) {
        this.a = tcs0Var;
        this.b = iz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayz)) {
            return false;
        }
        ayz ayzVar = (ayz) obj;
        return this.a.equals(ayzVar.a) && u890.j(this.b, ayzVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iz21 iz21Var = this.b;
        return iHashCode + (iz21Var == null ? 0 : iz21Var.a.hashCode());
    }
}
