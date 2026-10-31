package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x9x0 extends yax0 {
    public final boolean a;

    public x9x0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9x0) && this.a == ((x9x0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
