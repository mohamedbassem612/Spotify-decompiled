package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e4k1 {
    public final String a;
    public final Long b;
    public final c4k1 c;

    public e4k1(String str, Long l, c4k1 c4k1Var) {
        this.a = str;
        this.b = l;
        this.c = c4k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4k1)) {
            return false;
        }
        e4k1 e4k1Var = (e4k1) obj;
        return this.a.equals(e4k1Var.a) && u890.j(this.b, e4k1Var.b) && u890.j(this.c, e4k1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }
}
