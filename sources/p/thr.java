package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class thr extends r6p1 {
    public final j4b1 c;
    public final float d;

    public thr(j4b1 j4b1Var, float f) {
        this.c = j4b1Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thr)) {
            return false;
        }
        thr thrVar = (thr) obj;
        return this.c == thrVar.c && Float.compare(this.d, thrVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
