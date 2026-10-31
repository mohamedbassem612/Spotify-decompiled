package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r7l1 {
    public final int a;

    public r7l1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7l1) && this.a == ((r7l1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
