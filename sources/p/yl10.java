package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yl10 extends am10 {
    public final String a;
    public final td b;
    public final omo1 c;

    public yl10(String str, td tdVar, omo1 omo1Var) {
        this.a = str;
        this.b = tdVar;
        this.c = omo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl10)) {
            return false;
        }
        yl10 yl10Var = (yl10) obj;
        return u890.j(this.a, yl10Var.a) && u890.j(this.b, yl10Var.b) && this.c.equals(yl10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
