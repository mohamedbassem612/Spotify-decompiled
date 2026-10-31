package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zoc1 extends cbp1 {
    public final j331 c;

    public zoc1(j331 j331Var) {
        this.c = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoc1) && this.c.equals(((zoc1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
