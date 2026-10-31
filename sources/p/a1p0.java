package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1p0 extends b1p0 {
    public final boolean a;

    public a1p0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1p0) && this.a == ((a1p0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
