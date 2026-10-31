package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ma9 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public ma9(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma9)) {
            return false;
        }
        ma9 ma9Var = (ma9) obj;
        return u890.j(this.a, ma9Var.a) && u890.j(this.b, ma9Var.b) && this.c == ma9Var.c && u890.j(this.d, ma9Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }
}
