package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oz61 {
    public final jz61 a;
    public final guo1 b;
    public final int c;
    public final boolean d;

    public oz61(jz61 jz61Var, guo1 guo1Var, int i, boolean z) {
        this.a = jz61Var;
        this.b = guo1Var;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz61)) {
            return false;
        }
        oz61 oz61Var = (oz61) obj;
        return this.a.equals(oz61Var.a) && this.b.equals(oz61Var.b) && this.c == oz61Var.c && this.d == oz61Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31);
    }
}
