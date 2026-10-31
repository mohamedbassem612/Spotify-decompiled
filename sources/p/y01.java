package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y01 {
    public final bk8 a;
    public final String b;
    public final String c;

    public y01(String str, String str2, bk8 bk8Var) {
        this.a = bk8Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y01)) {
            return false;
        }
        y01 y01Var = (y01) obj;
        return this.a == y01Var.a && u890.j(this.b, y01Var.b) && u890.j(this.c, y01Var.c);
    }

    public final int hashCode() {
        bk8 bk8Var = this.a;
        int iHashCode = (bk8Var == null ? 0 : bk8Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
