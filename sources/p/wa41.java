package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wa41 extends ha71 {
    public final String c;
    public final int d;

    public wa41(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa41)) {
            return false;
        }
        wa41 wa41Var = (wa41) obj;
        return u890.j(this.c, wa41Var.c) && this.d == wa41Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
