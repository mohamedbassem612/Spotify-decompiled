package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jb41 extends pb41 {
    public final boolean a;

    public jb41(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb41) && this.a == ((jb41) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
