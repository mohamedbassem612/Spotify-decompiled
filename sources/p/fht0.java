package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fht0 extends lht0 {
    public final tv80 a;

    public fht0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fht0) && this.a.equals(((fht0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
