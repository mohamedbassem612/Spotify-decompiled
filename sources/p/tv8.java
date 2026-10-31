package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tv8 {
    public final qxc0 a;
    public final String b;
    public final String c;

    public tv8(String str, String str2, qxc0 qxc0Var) {
        this.a = qxc0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv8)) {
            return false;
        }
        tv8 tv8Var = (tv8) obj;
        return this.a.equals(tv8Var.a) && u890.j(this.b, tv8Var.b) && u890.j(this.c, tv8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
