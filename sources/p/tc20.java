package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tc20 implements xc20 {
    public final yc20 a;

    public tc20(yc20 yc20Var) {
        this.a = yc20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc20) && this.a.equals(((tc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
