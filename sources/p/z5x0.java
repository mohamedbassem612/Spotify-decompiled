package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z5x0 extends q6x0 {
    public final tv80 a;

    public z5x0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5x0) && u890.j(this.a, ((z5x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
