package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z0a1 extends q1a1 {
    public final boolean a;

    public z0a1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0a1) && this.a == ((z0a1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
