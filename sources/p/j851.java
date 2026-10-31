package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j851 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j851(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j851)) {
            return false;
        }
        j851 j851Var = (j851) obj;
        return u890.j(this.a, j851Var.a) && u890.j(this.b, j851Var.b) && u890.j(this.c, j851Var.c) && u890.j(this.d, j851Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ j851() {
        this(null, null, null, null);
    }
}
