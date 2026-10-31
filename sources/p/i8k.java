package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i8k implements z8k {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public i8k(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8k)) {
            return false;
        }
        i8k i8kVar = (i8k) obj;
        return u890.j(this.a, i8kVar.a) && u890.j(this.b, i8kVar.b) && u890.j(this.c, i8kVar.c) && this.d.equals(i8kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
