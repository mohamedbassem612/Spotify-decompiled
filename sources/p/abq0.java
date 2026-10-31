package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class abq0 extends dbq0 {
    public final zaq0 a;
    public final zaq0 b;
    public final yaq0 c;

    public abq0(zaq0 zaq0Var, zaq0 zaq0Var2, yaq0 yaq0Var) {
        this.a = zaq0Var;
        this.b = zaq0Var2;
        this.c = yaq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abq0)) {
            return false;
        }
        abq0 abq0Var = (abq0) obj;
        return this.a.equals(abq0Var.a) && this.b.equals(abq0Var.b) && u890.j(this.c, abq0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yaq0 yaq0Var = this.c;
        return iHashCode + (yaq0Var == null ? 0 : yaq0Var.hashCode());
    }
}
