package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class krx0 extends ktx0 {
    public final boolean a;

    public krx0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krx0) && this.a == ((krx0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
