package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lhv0 extends xap1 {
    public final String c;
    public final String d;

    public lhv0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhv0)) {
            return false;
        }
        lhv0 lhv0Var = (lhv0) obj;
        return u890.j(this.c, lhv0Var.c) && u890.j(this.d, lhv0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }
}
