package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class um61 {
    public final iu30 a;
    public final iu30 b;
    public final iu30 c;

    public um61(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um61)) {
            return false;
        }
        um61 um61Var = (um61) obj;
        return this.a.equals(um61Var.a) && this.b.equals(um61Var.b) && this.c.equals(um61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
