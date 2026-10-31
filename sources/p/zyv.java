package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zyv extends crn1 {
    public final boolean b;

    public zyv(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyv) && this.b == ((zyv) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
