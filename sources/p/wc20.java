package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wc20 implements xc20 {
    public final yc20 a;
    public final zc20 b;

    public wc20(yc20 yc20Var, zc20 zc20Var) {
        this.a = yc20Var;
        this.b = zc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc20)) {
            return false;
        }
        wc20 wc20Var = (wc20) obj;
        return this.a.equals(wc20Var.a) && this.b.equals(wc20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
