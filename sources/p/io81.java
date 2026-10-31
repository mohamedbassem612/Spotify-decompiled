package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class io81 extends s9p1 {
    public final vww c;

    public io81(vww vwwVar) {
        this.c = vwwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io81) && this.c.equals(((io81) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
