package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ym9 {
    public final boolean a;

    public ym9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym9) && this.a == ((ym9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
