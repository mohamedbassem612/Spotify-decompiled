package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m0v implements o0v {
    public final int a;

    public m0v(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0v) && this.a == ((m0v) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
