package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iwz implements q600 {
    public final ns60 a;

    public iwz(ns60 ns60Var) {
        this.a = ns60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwz) && this.a.equals(((iwz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
