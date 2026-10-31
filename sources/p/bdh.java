package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bdh implements qim0 {
    public final qim0 a;
    public final qim0 b;

    public bdh(qim0 qim0Var, qim0 qim0Var2) {
        this.a = qim0Var;
        this.b = qim0Var2;
    }

    @Override // p.qim0
    public final boolean all(iu30 iu30Var) {
        return this.a.all(iu30Var) && this.b.all(iu30Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bdh)) {
            return false;
        }
        bdh bdhVar = (bdh) obj;
        return this.a.equals(bdhVar.a) && u890.j(this.b, bdhVar.b);
    }

    @Override // p.qim0
    public final Object foldIn(Object obj, vu30 vu30Var) {
        return this.b.foldIn(this.a.foldIn(obj, vu30Var), vu30Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) foldIn(new StringBuilder("["), new n75((byte) 11));
        sb.append("]");
        return sb.toString();
    }
}
