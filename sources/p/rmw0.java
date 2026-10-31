package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rmw0 implements umw0 {
    public final long a;

    public rmw0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rmw0) && this.a == ((rmw0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
