package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q1j0 implements t1j0 {
    public final boolean a;

    public q1j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1j0) && this.a == ((q1j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
