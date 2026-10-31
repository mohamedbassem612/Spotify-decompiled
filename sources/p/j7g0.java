package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j7g0 {
    public final boolean a;

    public j7g0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7g0) && this.a == ((j7g0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
