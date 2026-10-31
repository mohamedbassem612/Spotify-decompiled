package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mz41 extends q151 {
    public final String a;
    public final tv80 b;
    public final boolean c;
    public final boolean d;

    public mz41(String str, tv80 tv80Var, boolean z, boolean z2) {
        this.a = str;
        this.b = tv80Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz41)) {
            return false;
        }
        mz41 mz41Var = (mz41) obj;
        return u890.j(this.a, mz41Var.a) && u890.j(this.b, mz41Var.b) && this.c == mz41Var.c && this.d == mz41Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31, 31, this.c);
    }
}
