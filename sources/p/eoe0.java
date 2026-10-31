package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eoe0 extends moe0 {
    public final String a;
    public final moe0 b;
    public final moe0 c;
    public final boolean d;

    public eoe0(String str, moe0 moe0Var, moe0 moe0Var2, boolean z) {
        this.a = str;
        this.b = moe0Var;
        this.c = moe0Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe0)) {
            return false;
        }
        eoe0 eoe0Var = (eoe0) obj;
        return this.a.equals(eoe0Var.a) && u890.j(this.b, eoe0Var.b) && u890.j(this.c, eoe0Var.c) && this.d == eoe0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        moe0 moe0Var = this.b;
        int iHashCode2 = (iHashCode + (moe0Var == null ? 0 : moe0Var.hashCode())) * 31;
        moe0 moe0Var2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (moe0Var2 != null ? moe0Var2.hashCode() : 0)) * 31);
    }
}
