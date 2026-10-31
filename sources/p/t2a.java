package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t2a implements y2a {
    public final int a;

    public t2a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2a) && this.a == ((t2a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
