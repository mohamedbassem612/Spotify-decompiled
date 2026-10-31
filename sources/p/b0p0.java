package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b0p0 extends g0p0 {
    public final boolean a;

    public b0p0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0p0) && this.a == ((b0p0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
