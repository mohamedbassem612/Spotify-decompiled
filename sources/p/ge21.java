package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ge21 {
    public final ee21 a;
    public final int b;

    public ge21(ee21 ee21Var, int i) {
        this.a = ee21Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge21)) {
            return false;
        }
        ge21 ge21Var = (ge21) obj;
        return this.a.equals(ge21Var.a) && this.b == ge21Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
