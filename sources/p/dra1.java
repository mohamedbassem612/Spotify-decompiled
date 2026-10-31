package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dra1 {
    public final int a;

    public dra1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dra1) && this.a == ((dra1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
