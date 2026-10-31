package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tlk extends vlk {
    public final boolean a;

    public tlk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlk) && this.a == ((tlk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
