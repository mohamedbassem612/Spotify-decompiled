package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class luf1 {
    public final String a;
    public final cvf1 b;

    public luf1(String str, cvf1 cvf1Var) {
        this.a = str;
        this.b = cvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luf1)) {
            return false;
        }
        luf1 luf1Var = (luf1) obj;
        return this.a.equals(luf1Var.a) && u890.j(this.b, luf1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        return iHashCode + 1396393329;
    }
}
