package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s131 extends t131 {
    public final fe71 a;

    public s131(fe71 fe71Var) {
        this.a = fe71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s131) && this.a.equals(((s131) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
