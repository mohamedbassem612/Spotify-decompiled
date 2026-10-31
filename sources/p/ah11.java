package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ah11 extends gh11 {
    public final boolean a;

    public ah11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah11) && this.a == ((ah11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
