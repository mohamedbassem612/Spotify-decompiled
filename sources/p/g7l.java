package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g7l {
    public final boolean a;

    public g7l(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7l) && this.a == ((g7l) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
