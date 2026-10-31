package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ku41 implements nu41 {
    public final float a;
    public final boolean b;

    public ku41(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku41)) {
            return false;
        }
        ku41 ku41Var = (ku41) obj;
        return Float.compare(this.a, ku41Var.a) == 0 && this.b == ku41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
