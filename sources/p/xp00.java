package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xp00 implements yp00 {
    public final int a;
    public final boolean b;

    public xp00(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp00)) {
            return false;
        }
        xp00 xp00Var = (xp00) obj;
        return this.a == xp00Var.a && this.b == xp00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
