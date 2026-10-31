package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class al41 {
    public final mvh1 a;
    public final String b;
    public final boolean c;

    public al41(mvh1 mvh1Var, String str, boolean z) {
        this.a = mvh1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al41)) {
            return false;
        }
        al41 al41Var = (al41) obj;
        return this.a.equals(al41Var.a) && u890.j(this.b, al41Var.b) && this.c == al41Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
