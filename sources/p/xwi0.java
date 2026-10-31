package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xwi0 {
    public final zdz0 a;

    public xwi0(zdz0 zdz0Var) {
        this.a = zdz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwi0) && u890.j(this.a, ((xwi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
