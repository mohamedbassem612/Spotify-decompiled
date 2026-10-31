package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t4g implements v4g {
    public final int a;

    public t4g(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4g) && this.a == ((t4g) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
