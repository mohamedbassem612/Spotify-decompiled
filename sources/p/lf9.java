package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lf9 implements pf9 {
    public final String a;
    public final int b;

    public lf9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf9)) {
            return false;
        }
        lf9 lf9Var = (lf9) obj;
        return this.a.equals(lf9Var.a) && this.b == lf9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
