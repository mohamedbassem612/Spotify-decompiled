package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b4f implements d4f {
    public final int a;

    public b4f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4f) && this.a == ((b4f) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
