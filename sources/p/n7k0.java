package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n7k0 {
    public final qxc0 a;
    public final String b;
    public final String c;

    public n7k0(String str, String str2, qxc0 qxc0Var) {
        this.a = qxc0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7k0)) {
            return false;
        }
        n7k0 n7k0Var = (n7k0) obj;
        return this.a.equals(n7k0Var.a) && u890.j(this.b, n7k0Var.b) && u890.j(this.c, n7k0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
