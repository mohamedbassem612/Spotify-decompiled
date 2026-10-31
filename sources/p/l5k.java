package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l5k implements osi1 {
    public final iu30 a;

    public l5k(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.osi1
    public final Object a(xos0 xos0Var) {
        return this.a.invoke(xos0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5k) && u890.j(this.a, ((l5k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
