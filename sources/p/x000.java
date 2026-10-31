package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x000 extends c600 {
    public final tv80 a;

    public x000(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x000) && u890.j(this.a, ((x000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
