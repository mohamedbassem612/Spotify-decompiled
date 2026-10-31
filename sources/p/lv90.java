package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lv90 {
    public final ov90 a;
    public final eu90 b;
    public final th c;

    public lv90(ov90 ov90Var, eu90 eu90Var, th thVar) {
        this.a = ov90Var;
        this.b = eu90Var;
        this.c = thVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lv90) {
            lv90 lv90Var = (lv90) obj;
            return u890.j(this.a, lv90Var.a) && this.b.equals(lv90Var.b) && this.c == lv90Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
