package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class md20 extends pd20 {
    public final yc20 a;
    public final zc20 b;

    public md20(yc20 yc20Var, zc20 zc20Var) {
        this.a = yc20Var;
        this.b = zc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md20)) {
            return false;
        }
        md20 md20Var = (md20) obj;
        return this.a.equals(md20Var.a) && this.b.equals(md20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
