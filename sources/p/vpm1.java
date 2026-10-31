package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vpm1 implements xpm1 {
    public final zpm1 a;

    public vpm1(zpm1 zpm1Var) {
        this.a = zpm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpm1) && this.a.equals(((vpm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
