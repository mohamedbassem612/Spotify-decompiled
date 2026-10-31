package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r37 {
    public final int a;

    public r37(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r37) && this.a == ((r37) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
