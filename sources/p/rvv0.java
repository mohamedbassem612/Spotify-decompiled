package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rvv0 implements svv0 {
    public final boolean a;

    public rvv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvv0) && this.a == ((rvv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
