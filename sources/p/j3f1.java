package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j3f1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j3f1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3f1)) {
            return false;
        }
        j3f1 j3f1Var = (j3f1) obj;
        return this.a.equals(j3f1Var.a) && this.b.equals(j3f1Var.b) && u890.j(this.c, j3f1Var.c) && u890.j(this.d, j3f1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) - 637232924;
    }
}
