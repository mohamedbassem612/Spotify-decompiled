package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ui9 implements bj9 {
    public final re9 a;

    public ui9(re9 re9Var) {
        this.a = re9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui9) && this.a.equals(((ui9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
