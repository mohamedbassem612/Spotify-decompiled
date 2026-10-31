package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ce91 implements qq60 {
    public final String a;
    public final op80 b;
    public final ef91 c;
    public final String d;

    public ce91(String str, op80 op80Var, ef91 ef91Var, String str2) {
        this.a = str;
        this.b = op80Var;
        this.c = ef91Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce91)) {
            return false;
        }
        ce91 ce91Var = (ce91) obj;
        return this.a.equals(ce91Var.a) && this.b.equals(ce91Var.b) && this.c == ce91Var.c && u890.j(this.d, ce91Var.d);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
