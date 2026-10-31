package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v6g1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public v6g1(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6g1)) {
            return false;
        }
        v6g1 v6g1Var = (v6g1) obj;
        return u890.j(this.a, v6g1Var.a) && u890.j(this.b, v6g1Var.b) && u890.j(this.c, v6g1Var.c) && this.d == v6g1Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
