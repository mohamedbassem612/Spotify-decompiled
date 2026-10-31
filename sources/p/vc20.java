package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vc20 implements xc20 {
    public final yc20 a;
    public final zc20 b;

    public vc20(yc20 yc20Var, zc20 zc20Var) {
        this.a = yc20Var;
        this.b = zc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc20)) {
            return false;
        }
        vc20 vc20Var = (vc20) obj;
        return this.a.equals(vc20Var.a) && this.b.equals(vc20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
