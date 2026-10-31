package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ksa extends fbp1 {
    public final pta c;

    public ksa(pta ptaVar) {
        this.c = ptaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksa) && this.c.equals(((ksa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
