package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vtt0 implements wtt0 {
    public final ttt0 a;

    public vtt0(ttt0 ttt0Var) {
        this.a = ttt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtt0) && this.a == ((vtt0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
