package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bt11 implements ct11 {
    public final boolean a;

    public bt11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt11) && this.a == ((bt11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
