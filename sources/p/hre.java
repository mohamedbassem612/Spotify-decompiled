package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hre implements jre {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public hre(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static hre a(hre hreVar) {
        return new hre(hreVar.a, hreVar.b, hreVar.c, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hre)) {
            return false;
        }
        hre hreVar = (hre) obj;
        return u890.j(this.a, hreVar.a) && u890.j(this.b, hreVar.b) && u890.j(this.c, hreVar.c) && this.d == hreVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ hre(String str) {
        this(str, null, null, false);
    }
}
