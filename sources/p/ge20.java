package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ge20 {
    public final fe20 a;
    public final String b;

    public ge20(fe20 fe20Var, String str) {
        this.a = fe20Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge20)) {
            return false;
        }
        ge20 ge20Var = (ge20) obj;
        return this.a.equals(ge20Var.a) && u890.j(this.b, ge20Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
