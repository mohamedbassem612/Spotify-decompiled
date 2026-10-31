package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ppm1 {
    public final tv80 a;

    public ppm1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppm1) && u890.j(this.a, ((ppm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
