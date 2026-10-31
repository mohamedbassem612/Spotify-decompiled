package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bww extends cww {
    public final ug8 a;

    public bww(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bww) && this.a.equals(((bww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
