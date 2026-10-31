package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dxm0 implements fxm0 {
    public final int a;

    public dxm0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxm0) && this.a == ((dxm0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
