package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wo implements ap {
    public final hwe0 a;

    public wo(hwe0 hwe0Var) {
        this.a = hwe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo) && this.a.equals(((wo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
