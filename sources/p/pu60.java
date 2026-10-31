package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pu60 extends ru60 {
    public final String a;
    public final zj11 b;

    public pu60(String str, zj11 zj11Var) {
        this.a = str;
        this.b = zj11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu60)) {
            return false;
        }
        pu60 pu60Var = (pu60) obj;
        return u890.j(this.a, pu60Var.a) && u890.j(this.b, pu60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zj11 zj11Var = this.b;
        return iHashCode + (zj11Var == null ? 0 : zj11Var.hashCode());
    }
}
