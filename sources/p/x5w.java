package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x5w {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public x5w(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5w)) {
            return false;
        }
        x5w x5wVar = (x5w) obj;
        return this.a.equals(x5wVar.a) && this.b.equals(x5wVar.b) && u890.j(this.c, x5wVar.c) && u890.j(this.d, x5wVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
