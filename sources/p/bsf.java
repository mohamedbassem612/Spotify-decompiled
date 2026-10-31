package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bsf implements gsf {
    public final ns60 a;

    public bsf(ns60 ns60Var) {
        this.a = ns60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsf) && this.a.equals(((bsf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
