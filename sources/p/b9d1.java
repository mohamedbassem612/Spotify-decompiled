package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9d1 {
    public final int a;

    public b9d1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9d1) && this.a == ((b9d1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
