package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mvu0 extends g6p1 {
    public final hvu0 c;
    public final boolean d;
    public final boolean e;

    public mvu0(hvu0 hvu0Var, boolean z) {
        this.c = hvu0Var;
        this.d = z;
        this.e = !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvu0)) {
            return false;
        }
        mvu0 mvu0Var = (mvu0) obj;
        return u890.j(this.c, mvu0Var.c) && this.d == mvu0Var.d;
    }

    public final hvu0 h() {
        return this.c;
    }

    public final int hashCode() {
        hvu0 hvu0Var = this.c;
        return Boolean.hashCode(this.d) + ((hvu0Var == null ? 0 : hvu0Var.hashCode()) * 31);
    }

    public final boolean l() {
        return this.e;
    }
}
