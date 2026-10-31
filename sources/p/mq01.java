package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mq01 implements qq60 {
    public final oq01 a;
    public final String b;
    public final op80 c;

    public mq01(oq01 oq01Var, String str, op80 op80Var) {
        this.a = oq01Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq01)) {
            return false;
        }
        mq01 mq01Var = (mq01) obj;
        return this.a.equals(mq01Var.a) && this.b.equals(mq01Var.b) && this.c.equals(mq01Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
