package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j5a implements m5a {
    public final int a;

    public j5a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5a) && this.a == ((j5a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
