package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zm91 {
    public final boolean a;

    public zm91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm91) && this.a == ((zm91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
