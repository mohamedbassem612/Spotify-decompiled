package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i8k0 {
    public final lhg1 a;
    public final String b;

    public i8k0(lhg1 lhg1Var, String str) {
        this.a = lhg1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8k0)) {
            return false;
        }
        i8k0 i8k0Var = (i8k0) obj;
        return u890.j(this.a, i8k0Var.a) && this.b.equals(i8k0Var.b);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        return this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31);
    }
}
