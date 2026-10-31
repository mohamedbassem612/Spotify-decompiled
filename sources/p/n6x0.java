package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n6x0 extends q6x0 {
    public final tv80 a;

    public n6x0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6x0) && u890.j(this.a, ((n6x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
