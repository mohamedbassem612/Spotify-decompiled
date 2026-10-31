package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r46 implements t46 {
    public final dxn0 a;
    public final String b;

    public r46(dxn0 dxn0Var, String str) {
        this.a = dxn0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r46)) {
            return false;
        }
        r46 r46Var = (r46) obj;
        return this.a.equals(r46Var.a) && u890.j(this.b, r46Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
