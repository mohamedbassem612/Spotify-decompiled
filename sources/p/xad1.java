package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xad1 implements zad1, fgb1 {
    public final int a;
    public final boolean b;

    public xad1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xad1)) {
            return false;
        }
        xad1 xad1Var = (xad1) obj;
        return this.a == xad1Var.a && this.b == xad1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
