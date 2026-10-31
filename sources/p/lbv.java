package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lbv {
    public final lia1 a;
    public final String b;
    public final String c;

    public lbv(lia1 lia1Var, String str, String str2) {
        this.a = lia1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbv)) {
            return false;
        }
        lbv lbvVar = (lbv) obj;
        return this.a == lbvVar.a && u890.j(this.b, lbvVar.b) && this.c.equals(lbvVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
