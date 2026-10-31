package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ppe0 extends spe0 {
    public final String a;
    public final moe0 b;
    public final moe0 c;
    public final boolean d;

    public ppe0(String str, moe0 moe0Var, moe0 moe0Var2, boolean z) {
        this.a = str;
        this.b = moe0Var;
        this.c = moe0Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe0)) {
            return false;
        }
        ppe0 ppe0Var = (ppe0) obj;
        return this.a.equals(ppe0Var.a) && u890.j(this.b, ppe0Var.b) && u890.j(this.c, ppe0Var.c) && this.d == ppe0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        moe0 moe0Var = this.b;
        int iHashCode2 = (iHashCode + (moe0Var == null ? 0 : moe0Var.hashCode())) * 31;
        moe0 moe0Var2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (moe0Var2 != null ? moe0Var2.hashCode() : 0)) * 31);
    }
}
