package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i5w0 extends spq0 {
    public final Object a;

    public i5w0(Object obj) {
        this.a = obj;
    }

    @Override // p.spq0
    public final Object b() {
        return this.a;
    }

    @Override // p.spq0
    public final boolean c() {
        return true;
    }

    @Override // p.spq0
    public final Object e(Object obj) {
        dm5.s(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    @Override // p.spq0
    public final boolean equals(Object obj) {
        if (obj instanceof i5w0) {
            return this.a.equals(((i5w0) obj).a);
        }
        return false;
    }

    @Override // p.spq0
    public final Object f(otc otcVar) {
        return this.a;
    }

    @Override // p.spq0
    public final spq0 g(spq0 spq0Var) {
        spq0Var.getClass();
        return this;
    }

    @Override // p.spq0
    public final Object h() {
        return this.a;
    }

    @Override // p.spq0
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // p.spq0
    public final spq0 i(su30 su30Var) {
        Object objApply = su30Var.apply(this.a);
        dm5.s(objApply, "the Function passed to Optional.transform() must not return null.");
        return new i5w0(objApply);
    }

    public final String toString() {
        return td6.l(new StringBuilder("Optional.of("), this.a, ")");
    }
}
