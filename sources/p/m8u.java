package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m8u extends d9u {
    public final boolean a;

    public m8u(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8u) && this.a == ((m8u) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
