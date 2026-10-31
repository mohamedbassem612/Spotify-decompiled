package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mbv0 implements sbv0 {
    public final boolean a;

    public mbv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbv0) && this.a == ((mbv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
