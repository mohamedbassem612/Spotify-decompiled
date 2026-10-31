package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x7a1 implements y7a1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public x7a1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a1)) {
            return false;
        }
        x7a1 x7a1Var = (x7a1) obj;
        return this.a.equals(x7a1Var.a) && u890.j(this.b, x7a1Var.b) && u890.j(this.c, x7a1Var.c) && u890.j(this.d, x7a1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
