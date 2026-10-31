package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jde1 implements lde1 {
    public final int a;

    public jde1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jde1) && this.a == ((jde1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
