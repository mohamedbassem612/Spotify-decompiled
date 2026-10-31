package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ry0 {
    public final qy0 a;

    public ry0(qy0 qy0Var) {
        this.a = qy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry0) && this.a.equals(((ry0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
