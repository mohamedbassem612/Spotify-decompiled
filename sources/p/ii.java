package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ii extends axo1 {
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public ii(String str, int i, String str2, String str3, boolean z, String str4) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return this.b == iiVar.b && u890.j(this.c, iiVar.c) && u890.j(this.d, iiVar.d) && u890.j(this.e, iiVar.e) && this.f == iiVar.f && u890.j(this.g, iiVar.g);
    }

    public final int hashCode() {
        int iC = l1d.C(this.b) * 31;
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iG = xcg1.g((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        return iG + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ ii(int i, String str, String str2) {
        this(str, i, str2, null, false, null);
    }
}
