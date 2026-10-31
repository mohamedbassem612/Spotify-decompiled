package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qba0 implements vba0 {
    public final ns60 a;

    public qba0(ns60 ns60Var) {
        this.a = ns60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qba0) && this.a.equals(((qba0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
