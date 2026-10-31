package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vv41 {
    public final t45 a;
    public final String b;

    public vv41(String str, t45 t45Var) {
        this.a = t45Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vv41) {
            vv41 vv41Var = (vv41) obj;
            if (this.a == vv41Var.a && this.b.equals(vv41Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
