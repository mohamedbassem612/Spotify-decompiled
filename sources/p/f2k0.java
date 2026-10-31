package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f2k0 implements k4k0 {
    public final int a;

    public f2k0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2k0) && this.a == ((f2k0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
