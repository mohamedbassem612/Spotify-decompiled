package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i5m1 {
    public final qxc0 a;

    public i5m1(qxc0 qxc0Var) {
        this.a = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5m1) && this.a.equals(((i5m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
