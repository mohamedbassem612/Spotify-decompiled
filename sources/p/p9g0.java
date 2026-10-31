package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p9g0 {
    public final int a;

    public p9g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9g0) && this.a == ((p9g0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
