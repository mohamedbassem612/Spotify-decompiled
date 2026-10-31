package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kl11 implements ez00 {
    public final cg51 a;

    public kl11(cg51 cg51Var) {
        this.a = cg51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl11) && this.a.equals(((kl11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
