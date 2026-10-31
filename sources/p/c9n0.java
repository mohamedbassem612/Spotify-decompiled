package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c9n0 {
    public final qxc0 a;

    public c9n0(qxc0 qxc0Var) {
        this.a = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9n0) && this.a.equals(((c9n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
