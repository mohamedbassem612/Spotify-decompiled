package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xqw implements yqw {
    public final jpg0 a;

    public xqw(jpg0 jpg0Var) {
        this.a = jpg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqw) && this.a == ((xqw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
