package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wxx0 implements yxx0 {
    public final xwx0 a;

    public wxx0(xwx0 xwx0Var) {
        this.a = xwx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wxx0) && this.a.equals(((wxx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
