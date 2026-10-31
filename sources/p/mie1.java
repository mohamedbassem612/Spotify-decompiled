package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mie1 {
    public final lhe1 a;
    public final boolean b;

    public mie1(lhe1 lhe1Var, boolean z) {
        this.a = lhe1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mie1)) {
            return false;
        }
        mie1 mie1Var = (mie1) obj;
        return this.a == mie1Var.a && this.b == mie1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
