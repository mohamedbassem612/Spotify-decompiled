package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y0x0 {
    public final String a;
    public final String b;
    public final int c;

    public y0x0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0x0)) {
            return false;
        }
        y0x0 y0x0Var = (y0x0) obj;
        return this.a.equals(y0x0Var.a) && this.b.equals(y0x0Var.b) && this.c == y0x0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
