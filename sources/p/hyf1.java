package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hyf1 {
    public final String a;
    public final String b;
    public final String c;
    public final qyf1 d;
    public final String e;

    public hyf1(String str, String str2, String str3, qyf1 qyf1Var, String str4, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        qyf1Var = (i & 8) != 0 ? pyf1.a : qyf1Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qyf1Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyf1)) {
            return false;
        }
        hyf1 hyf1Var = (hyf1) obj;
        return u890.j(this.a, hyf1Var.a) && u890.j(this.b, hyf1Var.b) && u890.j(this.c, hyf1Var.c) && this.d.equals(hyf1Var.d) && u890.j(this.e, hyf1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
