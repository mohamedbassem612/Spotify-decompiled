package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bma implements dma {
    public final String a;

    public bma(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bma) && this.a.equals(((bma) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
