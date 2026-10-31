package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xle0 extends hme0 {
    public final boolean a;

    public xle0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xle0) && this.a == ((xle0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
