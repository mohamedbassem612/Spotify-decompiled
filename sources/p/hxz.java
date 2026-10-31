package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hxz implements p600 {
    public final boolean a;

    public hxz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxz) && this.a == ((hxz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
