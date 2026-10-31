package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wk80 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wk80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk80)) {
            return false;
        }
        wk80 wk80Var = (wk80) obj;
        return this.a == wk80Var.a && this.b == wk80Var.b && this.c == wk80Var.c && this.d == wk80Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbQ = cy30.q(this.a, this.b, "InsetsValues(left=", ", top=", ", right=");
        sbQ.append(this.c);
        sbQ.append(", bottom=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
