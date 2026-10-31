package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o88 {
    public final pw50 a;
    public final jka b;
    public final kr00 c;
    public final String d;
    public final ph1 e;
    public final boolean f;

    public o88(pw50 pw50Var, jka jkaVar, kr00 kr00Var, String str, ph1 ph1Var, boolean z) {
        this.a = pw50Var;
        this.b = jkaVar;
        this.c = kr00Var;
        this.d = str;
        this.e = ph1Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o88)) {
            return false;
        }
        o88 o88Var = (o88) obj;
        return this.a.equals(o88Var.a) && this.b.equals(o88Var.b) && this.c.equals(o88Var.c) && this.d.equals(o88Var.d) && this.e == o88Var.e && this.f == o88Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }
}
