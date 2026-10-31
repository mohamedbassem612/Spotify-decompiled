package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u0b0 {
    public final int a;

    public u0b0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0b0) && this.a == ((u0b0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
