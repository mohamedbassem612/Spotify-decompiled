package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xji1 {
    public final uqo a;
    public final String b;

    public xji1(uqo uqoVar, String str) {
        this.a = uqoVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xji1)) {
            return false;
        }
        xji1 xji1Var = (xji1) obj;
        return this.a.equals(xji1Var.a) && u890.j(this.b, xji1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
