package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ks7 {
    public final String a;
    public final Long b;
    public final is7 c;

    public ks7(String str, Long l, is7 is7Var) {
        this.a = str;
        this.b = l;
        this.c = is7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks7)) {
            return false;
        }
        ks7 ks7Var = (ks7) obj;
        return this.a.equals(ks7Var.a) && u890.j(this.b, ks7Var.b) && u890.j(this.c, ks7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }
}
