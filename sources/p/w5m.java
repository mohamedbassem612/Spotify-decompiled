package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class w5m extends g6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w5m(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5m)) {
            return false;
        }
        w5m w5mVar = (w5m) obj;
        return this.a.equals(w5mVar.a) && u890.j(this.b, w5mVar.b) && u890.j(this.c, w5mVar.c) && this.d.equals(w5mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
