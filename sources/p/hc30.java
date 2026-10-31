package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hc30 implements cvl1, xpw {
    public final /* synthetic */ byte a;
    public final lzn0 b;
    public final op31 c;
    public final owf1 d;
    public final js20 e;
    public final psw f;
    public final hy00 g;

    public hc30(lzn0 lzn0Var, op31 op31Var, owf1 owf1Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = lzn0Var;
                this.c = op31Var;
                this.d = owf1Var;
                this.e = x3p1.n(new igo0(this, (byte) 0), qfo0.e, ofo0.e, (o8n) null, new igo0(this, (byte) 1), 8);
                j2i j2iVar = u3j.a;
                ien0 ien0Var = qsw.a;
                this.f = new psw(j2iVar, (byte) 0);
                this.g = n3o1.r(this).c(n3o0.Z, n3o0.N0);
                break;
            case 2:
                this.b = lzn0Var;
                this.c = op31Var;
                this.d = owf1Var;
                this.e = x3p1.n(new cgh1(this, (byte) 0), hzg1.S0, lbg1.R0, (o8n) null, new cgh1(this, (byte) 1), 8);
                j2i j2iVar2 = roj.a;
                ien0 ien0Var2 = qsw.a;
                this.f = new psw(j2iVar2, (byte) 0);
                this.g = n3o1.r(this).c(swg1.h, swg1.i);
                break;
            default:
                this.b = lzn0Var;
                this.c = op31Var;
                this.d = owf1Var;
                this.e = x3p1.n(new gc30(this, (byte) 0), m830.X, wo10.d1, (o8n) null, new gc30(this, (byte) 1), 8);
                j2i j2iVar3 = jpi.a;
                ien0 ien0Var3 = qsw.a;
                this.f = new psw(j2iVar3, (byte) 0);
                this.g = n3o1.r(this).c(je20.d1, je20.e1);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.g;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }
}
