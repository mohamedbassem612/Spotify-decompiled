package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c2f implements q3f {
    public final int a;

    public c2f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2f) && this.a == ((c2f) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
