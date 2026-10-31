package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class arc implements brc {
    public final int a;

    public arc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arc) && this.a == ((arc) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
