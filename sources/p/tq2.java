package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tq2 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public tq2(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        return this.a.equals(tq2Var.a) && u890.j(this.b, tq2Var.b) && this.c.equals(tq2Var.c) && this.d == tq2Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
