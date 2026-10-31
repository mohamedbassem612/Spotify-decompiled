package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vs2 {
    public final tt2 a;
    public final hr2 b;
    public final Long c;

    public vs2(tt2 tt2Var, hr2 hr2Var, Long l) {
        this.a = tt2Var;
        this.b = hr2Var;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs2)) {
            return false;
        }
        vs2 vs2Var = (vs2) obj;
        return u890.j(this.a, vs2Var.a) && u890.j(this.b, vs2Var.b) && u890.j(this.c, vs2Var.c);
    }

    public final int hashCode() {
        tt2 tt2Var = this.a;
        int iHashCode = (tt2Var == null ? 0 : tt2Var.hashCode()) * 31;
        hr2 hr2Var = this.b;
        int iHashCode2 = (iHashCode + (hr2Var == null ? 0 : hr2Var.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
