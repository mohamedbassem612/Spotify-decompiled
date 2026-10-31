package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lm91 extends sqe {
    public final boolean d;

    public lm91(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm91) && this.d == ((lm91) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
