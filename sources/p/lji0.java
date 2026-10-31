package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lji0 implements nji0 {
    public final boolean a;

    public lji0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lji0) && this.a == ((lji0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
