package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bh21 extends lh21 {
    public final x4i1 a;
    public final goe b;
    public final String c;

    public bh21(x4i1 x4i1Var, goe goeVar, String str) {
        this.a = x4i1Var;
        this.b = goeVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh21)) {
            return false;
        }
        bh21 bh21Var = (bh21) obj;
        return u890.j(this.a, bh21Var.a) && u890.j(this.b, bh21Var.b) && u890.j(this.c, bh21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
