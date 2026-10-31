package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bli0 extends eli0 {
    public final boolean a;

    public bli0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bli0) && this.a == ((bli0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
