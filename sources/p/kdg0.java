package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kdg0 {
    public final int a;

    public kdg0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdg0) && this.a == ((kdg0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
