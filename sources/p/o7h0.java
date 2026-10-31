package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o7h0 {
    public final xv2 a;
    public final m8r b;
    public final String c;

    public o7h0(xv2 xv2Var, m8r m8rVar, String str) {
        this.a = xv2Var;
        this.b = m8rVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7h0)) {
            return false;
        }
        o7h0 o7h0Var = (o7h0) obj;
        return this.a.equals(o7h0Var.a) && this.b.equals(o7h0Var.b) && this.c.equals(o7h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
