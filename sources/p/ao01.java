package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ao01 {
    public final co01 a;
    public final boolean b;

    public ao01(co01 co01Var, boolean z) {
        this.a = co01Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao01)) {
            return false;
        }
        ao01 ao01Var = (ao01) obj;
        return this.a.equals(ao01Var.a) && this.b == ao01Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
