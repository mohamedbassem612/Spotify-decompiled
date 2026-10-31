package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bd20 implements dd20 {
    public final yc20 a;
    public final zc20 b;

    public bd20(yc20 yc20Var, zc20 zc20Var) {
        this.a = yc20Var;
        this.b = zc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd20)) {
            return false;
        }
        bd20 bd20Var = (bd20) obj;
        return this.a.equals(bd20Var.a) && this.b.equals(bd20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
