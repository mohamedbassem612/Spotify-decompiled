package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x231 implements n331 {
    public final boolean a;

    public x231(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x231) && this.a == ((x231) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
