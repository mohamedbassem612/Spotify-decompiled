package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z0n1 extends q1n1 {
    public final boolean a;

    public z0n1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0n1) && this.a == ((z0n1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
