package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xah1 {
    public final qxc0 a;
    public final String b;

    public xah1(qxc0 qxc0Var, String str) {
        this.a = qxc0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xah1)) {
            return false;
        }
        xah1 xah1Var = (xah1) obj;
        return this.a.equals(xah1Var.a) && u890.j(this.b, xah1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
