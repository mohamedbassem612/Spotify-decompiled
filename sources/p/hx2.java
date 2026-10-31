package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hx2 {
    public final String a;
    public final hr2 b;
    public final String c;
    public final String d;

    public hx2(String str, hr2 hr2Var, String str2, String str3) {
        this.a = str;
        this.b = hr2Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx2)) {
            return false;
        }
        hx2 hx2Var = (hx2) obj;
        return u890.j(this.a, hx2Var.a) && u890.j(this.b, hx2Var.b) && u890.j(this.c, hx2Var.c) && u890.j(this.d, hx2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hr2 hr2Var = this.b;
        int iHashCode2 = (iHashCode + (hr2Var == null ? 0 : hr2Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ hx2(String str, hr2 hr2Var, String str2) {
        this(str, hr2Var, str2, null);
    }
}
