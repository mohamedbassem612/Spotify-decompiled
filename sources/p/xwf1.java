package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xwf1 implements ywf1 {
    public final umf0 a;

    public xwf1(umf0 umf0Var) {
        this.a = umf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwf1) && this.a == ((xwf1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
