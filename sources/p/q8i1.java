package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q8i1 extends r8i1 {
    public final String b;
    public final String c;
    public final String d;

    public q8i1(String str, String str2, String str3) {
        super(0);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8i1)) {
            return false;
        }
        q8i1 q8i1Var = (q8i1) obj;
        return u890.j(this.b, q8i1Var.b) && u890.j(this.c, q8i1Var.c) && u890.j(this.d, q8i1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
