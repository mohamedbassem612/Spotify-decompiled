package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5d implements u5d {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public q5d(String str, String str2, String str3, String str4, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5d)) {
            return false;
        }
        q5d q5dVar = (q5d) obj;
        return this.a == q5dVar.a && u890.j(this.b, q5dVar.b) && u890.j(this.c, q5dVar.c) && u890.j(this.d, q5dVar.d) && u890.j(this.e, q5dVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
