package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class njf1 {
    public final String a;
    public final float b;

    public njf1(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njf1)) {
            return false;
        }
        njf1 njf1Var = (njf1) obj;
        return this.a.equals(njf1Var.a) && Float.compare(this.b, njf1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
