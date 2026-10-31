package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fb4 {
    public final boolean a;

    public fb4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb4) && this.a == ((fb4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
