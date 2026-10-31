package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gq60 {
    public final hq60 a;
    public Long b = null;
    public Long c = null;

    public gq60(hq60 hq60Var) {
        this.a = hq60Var;
    }

    public final hq60 a() {
        return this.a;
    }

    public final Long b() {
        return this.c;
    }

    public final Long c() {
        return this.b;
    }

    public final void d(Long l) {
        this.c = l;
    }

    public final void e(Long l) {
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq60)) {
            return false;
        }
        gq60 gq60Var = (gq60) obj;
        return this.a.equals(gq60Var.a) && u890.j(this.b, gq60Var.b) && u890.j(this.c, gq60Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
