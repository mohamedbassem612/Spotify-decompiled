package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t3n extends z3n {
    public final tv80 a;

    public t3n(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3n) && u890.j(this.a, ((t3n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
