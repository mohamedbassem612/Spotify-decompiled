package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fba1 {
    public final jba1 a;

    public fba1(jba1 jba1Var) {
        this.a = jba1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fba1) && this.a.equals(((fba1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
