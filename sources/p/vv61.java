package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vv61 {
    public final tka0 a;
    public final Object b;

    public vv61(tka0 tka0Var, Object obj) {
        this.a = tka0Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv61)) {
            return false;
        }
        vv61 vv61Var = (vv61) obj;
        return u890.j(this.a, vv61Var.a) && u890.j(this.b, vv61Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
