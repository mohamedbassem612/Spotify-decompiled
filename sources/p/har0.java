package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class har0 {
    public final int a;

    public har0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof har0) && this.a == ((har0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
