package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv21 implements zv21 {
    public final th61 a;

    public xv21(th61 th61Var) {
        this.a = th61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv21) && this.a.equals(((xv21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
