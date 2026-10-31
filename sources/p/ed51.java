package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ed51 extends hd51 {
    public final boolean b;

    public ed51(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed51) && this.b == ((ed51) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
