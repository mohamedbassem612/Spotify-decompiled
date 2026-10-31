package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u6v0 {
    public final int a;

    public u6v0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6v0) && this.a == ((u6v0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
