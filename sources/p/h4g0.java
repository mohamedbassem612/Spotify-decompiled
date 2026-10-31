package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h4g0 implements j4g0 {
    public final int a;

    public h4g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4g0) && this.a == ((h4g0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
