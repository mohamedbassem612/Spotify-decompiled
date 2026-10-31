package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ogn0 implements pgn0 {
    public final boolean a;

    public ogn0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogn0) && this.a == ((ogn0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
