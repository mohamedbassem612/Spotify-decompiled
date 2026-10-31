package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jy51 implements ky51 {
    public final int a;

    public jy51(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy51) && this.a == ((jy51) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
