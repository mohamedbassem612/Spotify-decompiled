package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class msa extends fbp1 {
    public final pta c;

    public msa(pta ptaVar) {
        this.c = ptaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msa) && this.c.equals(((msa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
