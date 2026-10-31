package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x491 implements y491 {
    public final boolean a;

    public x491(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x491) && this.a == ((x491) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
