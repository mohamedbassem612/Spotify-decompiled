package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class td40 implements xd40 {
    public final boolean a;

    public td40(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td40) && this.a == ((td40) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
