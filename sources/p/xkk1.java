package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xkk1 implements ez00 {
    public final mq70 a;
    public final mq70 b;
    public final z6j1 c;
    public final pp70 d;
    public final mq70 e;
    public final mq70 f;

    public /* synthetic */ xkk1(mq70 mq70Var, mq70 mq70Var2, mq70 mq70Var3, int i) {
        this((i & 1) != 0 ? new mq70(null, 7) : mq70Var, null, null, null, (i & 16) != 0 ? null : mq70Var2, (i & 32) != 0 ? null : mq70Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkk1)) {
            return false;
        }
        xkk1 xkk1Var = (xkk1) obj;
        return u890.j(this.a, xkk1Var.a) && u890.j(this.b, xkk1Var.b) && u890.j(this.c, xkk1Var.c) && u890.j(this.d, xkk1Var.d) && u890.j(this.e, xkk1Var.e) && u890.j(this.f, xkk1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mq70 mq70Var = this.b;
        int iHashCode2 = (iHashCode + (mq70Var == null ? 0 : mq70Var.hashCode())) * 31;
        z6j1 z6j1Var = this.c;
        int iHashCode3 = (iHashCode2 + (z6j1Var == null ? 0 : z6j1Var.hashCode())) * 31;
        pp70 pp70Var = this.d;
        int iHashCode4 = (iHashCode3 + (pp70Var == null ? 0 : pp70Var.hashCode())) * 31;
        mq70 mq70Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (mq70Var2 == null ? 0 : mq70Var2.hashCode())) * 31;
        mq70 mq70Var3 = this.f;
        return iHashCode5 + (mq70Var3 != null ? mq70Var3.hashCode() : 0);
    }

    public xkk1(mq70 mq70Var, mq70 mq70Var2, z6j1 z6j1Var, pp70 pp70Var, mq70 mq70Var3, mq70 mq70Var4) {
        this.a = mq70Var;
        this.b = mq70Var2;
        this.c = z6j1Var;
        this.d = pp70Var;
        this.e = mq70Var3;
        this.f = mq70Var4;
    }
}
