package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class trh0 implements fsh0 {
    public final xoh0 a;

    public trh0(xoh0 xoh0Var) {
        this.a = xoh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trh0) && this.a.equals(((trh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
