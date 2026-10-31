package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oex extends qex {
    public final int b;
    public final vu30 c;
    public final vu30 d;
    public final vu30 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public oex(int i, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, int i2) {
        i = (i2 & 1) != 0 ? 19 : i;
        vu30Var = (i2 & 2) != 0 ? v30.T0 : vu30Var;
        vu30Var3 = (i2 & 8) != 0 ? urw.Z0 : vu30Var3;
        super(new kgx(i, vu30Var2, vu30Var3, vu30Var), 0);
        this.b = i;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oex)) {
            return false;
        }
        oex oexVar = (oex) obj;
        return this.b == oexVar.b && this.c.equals(oexVar.c) && this.d.equals(oexVar.d) && this.e.equals(oexVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hrt.g(hrt.g(l1d.C(this.b) * 31, 31, this.c), 31, this.d);
    }
}
