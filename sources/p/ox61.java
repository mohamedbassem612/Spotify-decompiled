package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ox61 {
    public final cr31 a;
    public final cr31 b;
    public final cr31 c;

    public ox61() {
        cr31 cr31VarB = er31.b(4.0f);
        cr31 cr31VarB2 = er31.b(4.0f);
        cr31 cr31VarB3 = er31.b(0.0f);
        this.a = cr31VarB;
        this.b = cr31VarB2;
        this.c = cr31VarB3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox61)) {
            return false;
        }
        ox61 ox61Var = (ox61) obj;
        return this.a.equals(ox61Var.a) && this.b.equals(ox61Var.b) && this.c.equals(ox61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ")";
    }
}
