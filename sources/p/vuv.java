package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vuv implements evv {
    public final tv80 a;

    public vuv(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuv) && u890.j(this.a, ((vuv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
