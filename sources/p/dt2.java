package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dt2 {
    public final String a;
    public final String b;
    public final String c;

    public dt2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt2)) {
            return false;
        }
        dt2 dt2Var = (dt2) obj;
        return u890.j(this.a, dt2Var.a) && u890.j(this.b, dt2Var.b) && u890.j(this.c, dt2Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ dt2(String str) {
        this(str, null, null);
    }
}
