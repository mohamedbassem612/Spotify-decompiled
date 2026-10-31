package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zrr0 {
    public final nkc0 a;
    public final int b;

    public zrr0(nkc0 nkc0Var, int i) {
        this.a = nkc0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrr0)) {
            return false;
        }
        zrr0 zrr0Var = (zrr0) obj;
        return this.a.equals(zrr0Var.a) && this.b == zrr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
