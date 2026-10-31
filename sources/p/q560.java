package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q560 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;

    public q560(String str, String str2, String str3, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q560)) {
            return false;
        }
        q560 q560Var = (q560) obj;
        return this.a == q560Var.a && u890.j(this.b, q560Var.b) && u890.j(this.c, q560Var.c) && u890.j(this.d, q560Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
