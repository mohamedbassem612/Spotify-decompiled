package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bvv0 {
    public final int a;

    public bvv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvv0) && this.a == ((bvv0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
