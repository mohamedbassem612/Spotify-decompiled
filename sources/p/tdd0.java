package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdd0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public tdd0(String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdd0)) {
            return false;
        }
        tdd0 tdd0Var = (tdd0) obj;
        return u890.j(this.a, tdd0Var.a) && u890.j(this.b, tdd0Var.b) && this.c == tdd0Var.c && u890.j(this.d, tdd0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
