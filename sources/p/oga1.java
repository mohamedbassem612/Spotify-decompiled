package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oga1 extends rga1 {
    public final bb20 a;

    public oga1(bb20 bb20Var) {
        this.a = bb20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oga1) && this.a.equals(((oga1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
