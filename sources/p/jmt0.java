package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jmt0 {
    public final int a;
    public final String b;
    public final String c;

    public jmt0(int i, String str, String str2, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        str2 = (i2 & 4) != 0 ? null : str2;
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmt0)) {
            return false;
        }
        jmt0 jmt0Var = (jmt0) obj;
        return this.a == jmt0Var.a && u890.j(this.b, jmt0Var.b) && u890.j(this.c, jmt0Var.c);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
