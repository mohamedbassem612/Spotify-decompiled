package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ofc0 {
    public final boolean a;

    public ofc0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofc0) && this.a == ((ofc0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
