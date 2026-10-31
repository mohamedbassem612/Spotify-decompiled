package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class id81 {
    public final ud81 a;
    public final String b;
    public final String c;
    public final String d;
    public final n1x e;
    public final mxh f;
    public final int g;
    public final int h;
    public final String i;

    public id81(ud81 ud81Var, String str, String str2, String str3, n1x n1xVar, mxh mxhVar, int i, int i2, String str4) {
        this.a = ud81Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = n1xVar;
        this.f = mxhVar;
        this.g = i;
        this.h = i2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id81)) {
            return false;
        }
        id81 id81Var = (id81) obj;
        return this.a.equals(id81Var.a) && this.b.equals(id81Var.b) && this.c.equals(id81Var.c) && u890.j(this.d, id81Var.d) && this.e.equals(id81Var.e) && u890.j(this.f, id81Var.f) && this.g == id81Var.g && this.h == id81Var.h && u890.j(this.i, id81Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        mxh mxhVar = this.f;
        int iK = ab80.k(this.h, ab80.k(this.g, (iHashCode + (mxhVar == null ? 0 : mxhVar.hashCode())) * 31, 31), 31);
        String str = this.i;
        return iK + (str != null ? str.hashCode() : 0);
    }
}
