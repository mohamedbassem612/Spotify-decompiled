package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o5f implements s5f {
    public final int a;

    public o5f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5f) && this.a == ((o5f) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
