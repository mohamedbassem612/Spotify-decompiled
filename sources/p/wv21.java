package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wv21 implements yv21 {
    public final th61 a;

    public wv21(th61 th61Var) {
        this.a = th61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv21) && u890.j(this.a, ((wv21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
