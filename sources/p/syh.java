package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syh extends yap1 {
    public final ice c;

    public syh(ice iceVar) {
        this.c = iceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syh) && this.c.equals(((syh) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
