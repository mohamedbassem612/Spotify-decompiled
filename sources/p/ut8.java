package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ut8 extends wt8 {
    public final boolean a;

    public ut8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ut8) && this.a == ((ut8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
