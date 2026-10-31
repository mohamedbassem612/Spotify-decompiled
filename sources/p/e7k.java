package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e7k {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public e7k(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7k)) {
            return false;
        }
        e7k e7kVar = (e7k) obj;
        return u890.j(this.a, e7kVar.a) && u890.j(this.b, e7kVar.b) && u890.j(this.c, e7kVar.c) && this.d == e7kVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
