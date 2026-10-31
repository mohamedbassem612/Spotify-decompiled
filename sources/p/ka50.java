package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ka50 {
    public final boolean a;

    public ka50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka50) && this.a == ((ka50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
