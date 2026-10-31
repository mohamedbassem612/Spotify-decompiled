package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p7u {
    public final int a;

    public p7u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7u) && this.a == ((p7u) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
