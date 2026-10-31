package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q1z0 implements t1z0 {
    public final boolean a;

    public q1z0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1z0) && this.a == ((q1z0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
