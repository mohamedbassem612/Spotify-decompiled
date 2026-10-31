package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hlw0 {
    public final lsm0 a;
    public final boolean b;
    public final Long c;

    public /* synthetic */ hlw0(lsm0 lsm0Var, Long l, int i) {
        this((i & 1) != 0 ? null : lsm0Var, false, (i & 4) != 0 ? null : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlw0)) {
            return false;
        }
        hlw0 hlw0Var = (hlw0) obj;
        return u890.j(this.a, hlw0Var.a) && this.b == hlw0Var.b && u890.j(this.c, hlw0Var.c);
    }

    public final int hashCode() {
        lsm0 lsm0Var = this.a;
        int iG = xcg1.g((lsm0Var == null ? 0 : lsm0Var.hashCode()) * 31, 31, this.b);
        Long l = this.c;
        return iG + (l != null ? l.hashCode() : 0);
    }

    public hlw0(lsm0 lsm0Var, boolean z, Long l) {
        this.a = lsm0Var;
        this.b = z;
        this.c = l;
    }
}
