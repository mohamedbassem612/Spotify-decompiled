package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h0k1 extends w5p1 {
    public final String c;
    public final boolean d;

    public h0k1(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0k1)) {
            return false;
        }
        h0k1 h0k1Var = (h0k1) obj;
        return this.c.equals(h0k1Var.c) && this.d == h0k1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
