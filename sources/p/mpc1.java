package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mpc1 implements ppc1 {
    public final int a;
    public final bj90 b;

    public mpc1(int i, bj90 bj90Var) {
        this.a = i;
        this.b = bj90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpc1)) {
            return false;
        }
        mpc1 mpc1Var = (mpc1) obj;
        return this.a == mpc1Var.a && this.b.equals(mpc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
