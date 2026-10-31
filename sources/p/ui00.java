package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ui00 {
    public final pod0 a;

    public ui00(pod0 pod0Var) {
        this.a = pod0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui00) && this.a.equals(((ui00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
