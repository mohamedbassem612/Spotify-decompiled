package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w3i1 implements y3i1 {
    public final String a;
    public final Long b;

    public w3i1(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3i1)) {
            return false;
        }
        w3i1 w3i1Var = (w3i1) obj;
        return u890.j(this.a, w3i1Var.a) && u890.j(this.b, w3i1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
