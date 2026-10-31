package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vo11 {
    public final String a;
    public final wo11 b;
    public final op80 c;

    public vo11(String str, wo11 wo11Var, op80 op80Var) {
        this.a = str;
        this.b = wo11Var;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo11)) {
            return false;
        }
        vo11 vo11Var = (vo11) obj;
        return u890.j(this.a, vo11Var.a) && this.b.equals(vo11Var.b) && this.c.equals(vo11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
