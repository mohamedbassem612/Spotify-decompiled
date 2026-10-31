package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y2z0 implements a3z0 {
    public final boolean a;

    public y2z0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2z0) && this.a == ((y2z0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
