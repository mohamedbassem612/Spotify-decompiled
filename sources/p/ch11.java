package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ch11 extends gh11 {
    public final boolean a;

    public ch11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch11) && this.a == ((ch11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
