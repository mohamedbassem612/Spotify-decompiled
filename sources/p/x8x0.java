package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x8x0 extends w361 {
    public final String c;
    public final String d;

    public x8x0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8x0)) {
            return false;
        }
        x8x0 x8x0Var = (x8x0) obj;
        return u890.j(this.c, x8x0Var.c) && this.d.equals(x8x0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
