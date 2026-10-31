package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jz10 extends cbp1 {
    public final pta c;

    public jz10(pta ptaVar) {
        this.c = ptaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz10) && this.c.equals(((jz10) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
