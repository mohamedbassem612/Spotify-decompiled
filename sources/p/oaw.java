package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oaw implements jiw {
    public final int a;

    public oaw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oaw) && this.a == ((oaw) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
