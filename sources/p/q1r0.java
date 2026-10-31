package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q1r0 implements dbr0 {
    public final boolean a;

    public q1r0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1r0) && this.a == ((q1r0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
