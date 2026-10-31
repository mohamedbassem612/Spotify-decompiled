package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bc10 {
    public final gt40 a;
    public final gt40 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bc10(gt40 gt40Var, int i) {
        int i2 = i & 2;
        gt40 gt40Var2 = et40.a;
        this(gt40Var2, i2 != 0 ? gt40Var2 : gt40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc10)) {
            return false;
        }
        bc10 bc10Var = (bc10) obj;
        return u890.j(this.a, bc10Var.a) && u890.j(this.b, bc10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.a + ", nonSizeModifiers=" + this.b + ')';
    }

    public bc10(gt40 gt40Var, gt40 gt40Var2) {
        this.a = gt40Var;
        this.b = gt40Var2;
    }
}
