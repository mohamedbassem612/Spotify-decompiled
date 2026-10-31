package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w8u extends d9u {
    public final boolean a;

    public w8u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8u) && this.a == ((w8u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
