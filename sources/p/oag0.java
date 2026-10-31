package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oag0 extends vag0 {
    public final boolean a;

    public oag0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oag0) && this.a == ((oag0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
