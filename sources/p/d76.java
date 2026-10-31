package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d76 implements m86 {
    public final dxn0 a;
    public final String b;

    public d76(dxn0 dxn0Var, String str) {
        this.a = dxn0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d76)) {
            return false;
        }
        d76 d76Var = (d76) obj;
        return u890.j(this.a, d76Var.a) && u890.j(this.b, d76Var.b);
    }

    public final int hashCode() {
        dxn0 dxn0Var = this.a;
        int iHashCode = (dxn0Var == null ? 0 : dxn0Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
