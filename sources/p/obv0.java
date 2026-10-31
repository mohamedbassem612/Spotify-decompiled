package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class obv0 implements sbv0 {
    public final int a;

    public obv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obv0) && this.a == ((obv0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
