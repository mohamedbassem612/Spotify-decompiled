package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5y {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public m5y(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5y)) {
            return false;
        }
        m5y m5yVar = (m5y) obj;
        return this.a.equals(m5yVar.a) && this.b.equals(m5yVar.b) && u890.j(this.c, m5yVar.c) && this.d == m5yVar.d && u890.j(this.e, m5yVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
