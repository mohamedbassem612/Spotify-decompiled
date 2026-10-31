package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wu00 {
    public final xkg0 a;

    public wu00(xkg0 xkg0Var) {
        this.a = xkg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wu00) && this.a.equals(((wu00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
