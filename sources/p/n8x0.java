package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n8x0 extends w361 {
    public final String c;
    public final String d;

    public n8x0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8x0)) {
            return false;
        }
        n8x0 n8x0Var = (n8x0) obj;
        return u890.j(this.c, n8x0Var.c) && this.d.equals(n8x0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
