package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iog extends x1p1 {
    public final wog c;

    public iog(wog wogVar) {
        this.c = wogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iog) && this.c.equals(((iog) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
