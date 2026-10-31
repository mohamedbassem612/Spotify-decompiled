package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fob1 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public fob1(String str, String str2, String str3, String str4, boolean z) {
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
        if (!(obj instanceof fob1)) {
            return false;
        }
        fob1 fob1Var = (fob1) obj;
        return this.a == fob1Var.a && u890.j(this.b, fob1Var.b) && u890.j(this.c, fob1Var.c) && u890.j(this.d, fob1Var.d) && u890.j(this.e, fob1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
