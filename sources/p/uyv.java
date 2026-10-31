package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uyv extends crn1 {
    public final boolean b;

    public uyv(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyv) && this.b == ((uyv) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
