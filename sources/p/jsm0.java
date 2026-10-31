package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jsm0 {
    public final Long a;
    public final Long b;

    public jsm0(Long l, Long l2) {
        this.a = l;
        this.b = l2;
        if (l == null && l2 == null) {
            eg.m("Clip must have a start or end position");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsm0)) {
            return false;
        }
        jsm0 jsm0Var = (jsm0) obj;
        return u890.j(this.a, jsm0Var.a) && u890.j(this.b, jsm0Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
