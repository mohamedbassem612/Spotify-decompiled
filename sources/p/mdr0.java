package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mdr0 extends ltn1 {
    public final c380 c;
    public final boolean d;

    public mdr0(c380 c380Var, boolean z) {
        this.c = c380Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdr0)) {
            return false;
        }
        mdr0 mdr0Var = (mdr0) obj;
        return u890.j(this.c, mdr0Var.c) && this.d == mdr0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
