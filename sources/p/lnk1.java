package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lnk1 {
    public final String a;
    public final boolean b;

    public lnk1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnk1)) {
            return false;
        }
        lnk1 lnk1Var = (lnk1) obj;
        return this.a.equals(lnk1Var.a) && this.b == lnk1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
