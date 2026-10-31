package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j8w extends m8w {
    public final tv80 a;

    public j8w(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8w) && u890.j(this.a, ((j8w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
