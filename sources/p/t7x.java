package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t7x {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public t7x(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7x)) {
            return false;
        }
        t7x t7xVar = (t7x) obj;
        return u890.j(this.a, t7xVar.a) && u890.j(this.b, t7xVar.b) && this.c == t7xVar.c && u890.j(this.d, t7xVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = ab80.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        return iK + (str3 != null ? str3.hashCode() : 0);
    }
}
