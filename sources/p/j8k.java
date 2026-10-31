package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j8k implements z8k {
    public final String a;
    public final String b;
    public final String c;
    public final i5d d;

    public j8k(String str, String str2, String str3, i5d i5dVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i5dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8k)) {
            return false;
        }
        j8k j8kVar = (j8k) obj;
        return u890.j(this.a, j8kVar.a) && u890.j(this.b, j8kVar.b) && u890.j(this.c, j8kVar.c) && this.d.equals(j8kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
