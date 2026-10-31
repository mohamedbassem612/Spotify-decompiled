package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c100 implements k600 {
    public final int a;

    public c100(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c100) && this.a == ((c100) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
