package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x6d implements d7d {
    public final int a;

    public x6d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6d) && this.a == ((x6d) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
