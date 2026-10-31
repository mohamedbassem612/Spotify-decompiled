package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a76 implements m86 {
    public final dxn0 a;
    public final String b;

    public a76(dxn0 dxn0Var, String str) {
        this.a = dxn0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a76)) {
            return false;
        }
        a76 a76Var = (a76) obj;
        return this.a.equals(a76Var.a) && u890.j(this.b, a76Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
