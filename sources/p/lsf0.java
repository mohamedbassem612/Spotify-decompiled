package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsf0 implements msf0 {
    public final String a;
    public final int b;

    public lsf0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf0)) {
            return false;
        }
        lsf0 lsf0Var = (lsf0) obj;
        return u890.j(this.a, lsf0Var.a) && this.b == lsf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
