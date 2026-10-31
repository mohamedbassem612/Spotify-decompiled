package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ft31 extends gm50 {
    public final zbm d;

    public ft31(zbm zbmVar) {
        this.d = zbmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ft31) && this.d.equals(((ft31) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
