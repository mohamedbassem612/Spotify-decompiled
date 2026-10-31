package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m4g0 implements o4g0 {
    public final int a;

    public m4g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4g0) && this.a == ((m4g0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
