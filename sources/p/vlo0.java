package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vlo0 {
    public final String a;
    public final xlo0 b;

    public vlo0(String str, xlo0 xlo0Var) {
        this.a = str;
        this.b = xlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlo0)) {
            return false;
        }
        vlo0 vlo0Var = (vlo0) obj;
        return this.a.equals(vlo0Var.a) && this.b.equals(vlo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
