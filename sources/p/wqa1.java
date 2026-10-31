package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wqa1 implements era1 {
    public final String a;
    public final double b;

    public wqa1(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqa1)) {
            return false;
        }
        wqa1 wqa1Var = (wqa1) obj;
        return u890.j(this.a, wqa1Var.a) && Double.compare(this.b, wqa1Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
