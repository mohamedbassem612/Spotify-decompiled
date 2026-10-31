package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nf81 {
    public final spq0 a;
    public final spq0 b;
    public final spq0 c;

    public nf81(spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.a = spq0Var;
        this.b = spq0Var2;
        this.c = spq0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf81)) {
            return false;
        }
        nf81 nf81Var = (nf81) obj;
        return this.a.equals(nf81Var.a) && this.b.equals(nf81Var.b) && this.c.equals(nf81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
