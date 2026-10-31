package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vh21 {
    public final boolean a;

    public vh21(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh21) && this.a == ((vh21) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
