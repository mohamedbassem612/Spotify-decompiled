package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pk61 {
    public final m560 a;
    public final cto1 b;
    public final fdg1 c;
    public final boolean d;

    public pk61(m560 m560Var, cto1 cto1Var, fdg1 fdg1Var, boolean z) {
        this.a = m560Var;
        this.b = cto1Var;
        this.c = fdg1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk61)) {
            return false;
        }
        pk61 pk61Var = (pk61) obj;
        return u890.j(this.a, pk61Var.a) && this.b.equals(pk61Var.b) && this.c.equals(pk61Var.c) && this.d == pk61Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
