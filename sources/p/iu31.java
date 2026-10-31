package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iu31 {
    public final ku31 a;
    public final i091 b;

    public iu31(ku31 ku31Var, i091 i091Var) {
        this.a = ku31Var;
        this.b = i091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu31)) {
            return false;
        }
        iu31 iu31Var = (iu31) obj;
        return u890.j(this.a, iu31Var.a) && u890.j(this.b, iu31Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        i091 i091Var = this.b;
        return iHashCode + (i091Var == null ? 0 : i091Var.hashCode());
    }
}
