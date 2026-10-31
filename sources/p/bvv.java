package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bvv implements evv {
    public final boolean a;

    public bvv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvv) && this.a == ((bvv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
