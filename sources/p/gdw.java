package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gdw {
    public final tv80 a;

    public gdw(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdw) && u890.j(this.a, ((gdw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
