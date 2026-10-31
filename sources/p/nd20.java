package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nd20 extends pd20 {
    public final yc20 a;
    public final zc20 b;

    public nd20(yc20 yc20Var, zc20 zc20Var) {
        this.a = yc20Var;
        this.b = zc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd20)) {
            return false;
        }
        nd20 nd20Var = (nd20) obj;
        return this.a.equals(nd20Var.a) && this.b.equals(nd20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
