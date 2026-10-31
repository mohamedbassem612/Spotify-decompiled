package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class anp0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public anp0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anp0)) {
            return false;
        }
        anp0 anp0Var = (anp0) obj;
        return u890.j(this.a, anp0Var.a) && u890.j(this.b, anp0Var.b) && u890.j(this.c, anp0Var.c) && this.d == anp0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.d;
        return iHashCode3 + (i != 0 ? l1d.C(i) : 0);
    }
}
