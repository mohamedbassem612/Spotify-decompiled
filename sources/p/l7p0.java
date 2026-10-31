package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l7p0 {
    public final int a;

    public l7p0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7p0) && this.a == ((l7p0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
