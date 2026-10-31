package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xtf1 implements ztf1 {
    public final String a;
    public final String b;
    public final int c;

    public xtf1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtf1)) {
            return false;
        }
        xtf1 xtf1Var = (xtf1) obj;
        return this.a.equals(xtf1Var.a) && u890.j(this.b, xtf1Var.b) && this.c == xtf1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
