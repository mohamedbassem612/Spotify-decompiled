package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hh71 extends u1p1 {
    public final boolean c;
    public final yg71 d;

    public hh71(boolean z, yg71 yg71Var) {
        this.c = z;
        this.d = yg71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh71)) {
            return false;
        }
        hh71 hh71Var = (hh71) obj;
        return this.c == hh71Var.c && u890.j(this.d, hh71Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.c) * 31;
        yg71 yg71Var = this.d;
        return iHashCode + (yg71Var == null ? 0 : yg71Var.hashCode());
    }
}
