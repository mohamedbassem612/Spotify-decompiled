package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class igc0 {
    public final fgc0 a;
    public final vq80 b;

    public igc0(fgc0 fgc0Var, vq80 vq80Var) {
        this.a = fgc0Var;
        this.b = vq80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof igc0) {
            igc0 igc0Var = (igc0) obj;
            return this.a.equals(igc0Var.a) && this.b == igc0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
