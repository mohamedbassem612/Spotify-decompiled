package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h321 extends m6p1 {
    public final l6p1 c;

    public h321(l6p1 l6p1Var) {
        this.c = l6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h321) && this.c.equals(((h321) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
