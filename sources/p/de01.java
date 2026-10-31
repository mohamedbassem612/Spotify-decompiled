package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class de01 implements ee01 {
    public final int a;

    public de01(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de01) && this.a == ((de01) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
