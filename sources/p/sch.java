package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sch implements gt40 {
    public final gt40 a;
    public final gt40 b;

    public sch(gt40 gt40Var, gt40 gt40Var2) {
        this.a = gt40Var;
        this.b = gt40Var2;
    }

    @Override // p.gt40
    public final boolean a(iu30 iu30Var) {
        return this.a.a(iu30Var) || this.b.a(iu30Var);
    }

    @Override // p.gt40
    public final boolean b() {
        return this.a.b() && this.b.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sch)) {
            return false;
        }
        sch schVar = (sch) obj;
        return this.a.equals(schVar.a) && u890.j(this.b, schVar.b);
    }

    @Override // p.gt40
    public final Object foldIn(Object obj, vu30 vu30Var) {
        return this.b.foldIn(this.a.foldIn(obj, vu30Var), vu30Var);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("["), (String) foldIn("", rng.Q0), ']');
    }
}
