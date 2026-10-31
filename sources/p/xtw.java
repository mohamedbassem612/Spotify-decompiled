package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xtw {
    public final maa a;
    public final vu30 b;
    public final xu30 c;

    public xtw(maa maaVar, vu30 vu30Var, xu30 xu30Var) {
        this.a = maaVar;
        this.b = vu30Var;
        this.c = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtw)) {
            return false;
        }
        xtw xtwVar = (xtw) obj;
        return this.a.equals(xtwVar.a) && this.b.equals(xtwVar.b) && u890.j(this.c, xtwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b);
    }
}
