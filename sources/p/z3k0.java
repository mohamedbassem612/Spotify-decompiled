package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z3k0 implements k4k0 {
    public final boolean a;

    public z3k0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3k0) && this.a == ((z3k0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
