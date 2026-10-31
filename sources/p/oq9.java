package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oq9 {
    public final boolean a;

    public oq9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq9) && this.a == ((oq9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
