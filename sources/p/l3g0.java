package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l3g0 {
    public final x3g0 a;

    public l3g0(x3g0 x3g0Var) {
        this.a = x3g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3g0) && this.a.equals(((l3g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
