package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nx61 {
    public final cr31 a;
    public final cr31 b;
    public final hw61 c;

    public nx61() {
        cr31 cr31VarB = er31.b(24.0f);
        cr31 cr31VarB2 = er31.b(36.0f);
        cr31 cr31Var = er31.a;
        this.a = cr31VarB;
        this.b = cr31VarB2;
        this.c = cr31Var;
    }

    public final hw61 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx61)) {
            return false;
        }
        nx61 nx61Var = (nx61) obj;
        return this.a.equals(nx61Var.a) && this.b.equals(nx61Var.b) && u890.j(this.c, nx61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ")";
    }
}
