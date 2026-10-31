package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y691 {
    public final boolean a;

    public y691(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y691) && this.a == ((y691) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
