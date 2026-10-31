package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oq41 {
    public final float a;
    public final float b;

    public oq41(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq41)) {
            return false;
        }
        oq41 oq41Var = (oq41) obj;
        return Float.compare(this.a, oq41Var.a) == 0 && Float.compare(this.b, oq41Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
