package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i1h implements v1h {
    public final tv80 a;

    public i1h(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1h) && u890.j(this.a, ((i1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
