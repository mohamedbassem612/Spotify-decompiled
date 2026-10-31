package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lp1 implements cq1 {
    public final String a;
    public final boolean b;

    public lp1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return u890.j(this.a, lp1Var.a) && this.b == lp1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
