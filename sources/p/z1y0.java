package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z1y0 implements b2y0 {
    public final tv80 a;

    public z1y0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1y0) && this.a.equals(((z1y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
