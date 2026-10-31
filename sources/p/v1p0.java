package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v1p0 {
    public final ns60 a;

    public v1p0(ns60 ns60Var) {
        this.a = ns60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1p0) && u890.j(this.a, ((v1p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
