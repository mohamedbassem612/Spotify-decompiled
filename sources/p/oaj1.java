package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oaj1 {
    public final vu30 a;
    public final vu30 b;
    public final vu30 c;

    public oaj1(vu30 vu30Var, ozw ozwVar, int i) {
        s55 s55Var = new s55(2, (lnm) null, (byte) 27);
        vu30Var = (i & 2) != 0 ? new s55(2, (lnm) null, (byte) 28) : vu30Var;
        ozwVar = (i & 4) != 0 ? zhi1.Z : ozwVar;
        this.a = s55Var;
        this.b = vu30Var;
        this.c = ozwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaj1)) {
            return false;
        }
        oaj1 oaj1Var = (oaj1) obj;
        return this.a.equals(oaj1Var.a) && this.b.equals(oaj1Var.b) && this.c.equals(oaj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.g(this.a.hashCode() * 31, 31, this.b);
    }
}
