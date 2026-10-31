package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class adh implements qyl {
    public final qyl a;
    public final qyl b;

    public adh(qyl qylVar, qyl qylVar2) {
        this.a = qylVar;
        this.b = qylVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adh)) {
            return false;
        }
        adh adhVar = (adh) obj;
        return this.a.equals(adhVar.a) && u890.j(this.b, adhVar.b);
    }

    @Override // p.qyl
    public final Object foldIn(Object obj, vu30 vu30Var) {
        return this.b.foldIn(this.a.foldIn(obj, vu30Var), vu30Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return cy30.m("[", foldIn("", rng.R0), "]");
    }
}
