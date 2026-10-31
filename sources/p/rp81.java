package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rp81 extends eq81 {
    public final gxw a;

    public rp81(gxw gxwVar) {
        this.a = gxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp81) && this.a.equals(((rp81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
