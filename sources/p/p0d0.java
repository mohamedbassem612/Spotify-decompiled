package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p0d0 {
    public final cob1 a;
    public final bmm b;
    public final o0d0 c;

    public p0d0(cob1 cob1Var, bmm bmmVar, o0d0 o0d0Var) {
        this.a = cob1Var;
        this.b = bmmVar;
        this.c = o0d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0d0)) {
            return false;
        }
        p0d0 p0d0Var = (p0d0) obj;
        return this.a == p0d0Var.a && this.b.equals(p0d0Var.b) && u890.j(this.c, p0d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
