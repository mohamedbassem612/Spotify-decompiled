package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rwz {
    public final boolean a;

    public rwz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwz) && this.a == ((rwz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
