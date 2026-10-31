package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nlh1 {
    public final Integer a;
    public final String b;
    public final String c;
    public final llh1 d;

    public nlh1(Integer num, String str, String str2, llh1 llh1Var) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = llh1Var;
    }

    public final llh1 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlh1)) {
            return false;
        }
        nlh1 nlh1Var = (nlh1) obj;
        return this.a.equals(nlh1Var.a) && u890.j(this.b, nlh1Var.b) && u890.j(this.c, nlh1Var.c) && this.d.equals(nlh1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
