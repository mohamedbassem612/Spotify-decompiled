package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lfa1 {
    public final vu30 a;
    public final vu30 b;
    public final vu30 c;
    public final vu30 d;
    public final ofa1 e;
    public final String f;

    public lfa1(vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, ofa1 ofa1Var, String str) {
        this.a = vu30Var;
        this.b = vu30Var2;
        this.c = vu30Var3;
        this.d = vu30Var4;
        this.e = ofa1Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfa1)) {
            return false;
        }
        lfa1 lfa1Var = (lfa1) obj;
        return this.a.equals(lfa1Var.a) && this.b.equals(lfa1Var.b) && this.c.equals(lfa1Var.c) && this.d.equals(lfa1Var.d) && u890.j(this.e, lfa1Var.e) && this.f.equals(lfa1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + hrt.g(hrt.g(hrt.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
