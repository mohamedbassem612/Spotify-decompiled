package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ds {
    public final int a;

    public ds(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds) && this.a == ((ds) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
