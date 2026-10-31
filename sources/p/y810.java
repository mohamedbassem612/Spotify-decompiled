package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y810 {
    public final boolean a;

    public y810(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y810) && this.a == ((y810) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
