package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sqt0 {
    public final Long a;
    public final String b;

    public sqt0(Long l, String str) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqt0)) {
            return false;
        }
        sqt0 sqt0Var = (sqt0) obj;
        return u890.j(this.a, sqt0Var.a) && this.b.equals(sqt0Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }
}
