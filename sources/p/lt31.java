package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lt31 implements mt31 {
    public final boolean a;

    public lt31(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lt31) && this.a == ((lt31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
