package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gu70 extends iu70 {
    public final aw70 a;
    public final au70 b;
    public final String c;
    public final mgo0 d;

    public gu70(aw70 aw70Var, au70 au70Var, String str, mgo0 mgo0Var) {
        this.a = aw70Var;
        this.b = au70Var;
        this.c = str;
        this.d = mgo0Var;
    }

    @Override // p.iu70
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu70)) {
            return false;
        }
        gu70 gu70Var = (gu70) obj;
        return this.a.equals(gu70Var.a) && u890.j(this.b, gu70Var.b) && this.c.equals(gu70Var.c) && u890.j(this.d, gu70Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        this.b.getClass();
        int iD = cy30.d((l1d.C(2) + iHashCode) * 31, 31, this.c);
        mgo0 mgo0Var = this.d;
        return iD + (mgo0Var == null ? 0 : mgo0Var.hashCode());
    }
}
