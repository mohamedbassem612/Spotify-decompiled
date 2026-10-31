package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fxj0 {
    public final qxc0 a;
    public final String b;
    public final String c;

    public fxj0(String str, String str2, qxc0 qxc0Var) {
        this.a = qxc0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxj0)) {
            return false;
        }
        fxj0 fxj0Var = (fxj0) obj;
        return this.a.equals(fxj0Var.a) && u890.j(this.b, fxj0Var.b) && u890.j(this.c, fxj0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
