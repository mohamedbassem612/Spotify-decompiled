package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hf2 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final mqw g;
    public final rqw h;

    public hf2(a62 a62Var, mwn0 mwn0Var, hnl hnlVar, boolean z) {
        ien0 ien0Var;
        this.a = (byte) 1;
        this.d = a62Var;
        this.e = mwn0Var;
        this.b = z;
        switch (hnlVar.a) {
            case 0:
                ien0Var = (jqg0) hnlVar.d;
                break;
            case 1:
                ien0Var = (jqg0) hnlVar.d;
                break;
            default:
                ien0Var = hnlVar.d;
                break;
        }
        this.f = ien0Var;
        this.g = x3p1.m(r4p1.k(ien0Var.a(), 200L), new srg(this, (byte) 0), new qff(this, (byte) 13), (o8n) null, new srg(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-867775211, new gtd(this, (byte) 29), true);
        ien0 ien0Var2 = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(r0f.V0, r0f.W0);
    }

    public static final /* synthetic */ a62 e(hf2 hf2Var) {
        return (a62) hf2Var.d;
    }

    public static final /* synthetic */ mwn0 f(hf2 hf2Var) {
        return (mwn0) hf2Var.e;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.h;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.c;
    }

    public rrg g(weu weuVar) {
        int iOrdinal = weuVar.ordinal();
        if (iOrdinal == 0) {
            return new qrg(1);
        }
        if (iOrdinal == 1) {
            return new qrg(2);
        }
        if (iOrdinal == 2) {
            return this.b ? prg.a : new qrg(3);
        }
        eg.o();
        return null;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        rey0 rey0Var = this.g;
        switch (b) {
            case 0:
                return (k8d1) rey0Var;
            case 1:
                return (js20) rey0Var;
            case 2:
                return rey0Var;
            case 3:
                return (js20) rey0Var;
            case 4:
                return rey0Var;
            default:
                return rey0Var;
        }
    }

    public hf2(njm njmVar, f4f0 f4f0Var, vb2 vb2Var, boolean z) {
        this.a = (byte) 0;
        this.d = njmVar;
        this.e = f4f0Var;
        this.f = vb2Var;
        this.b = z;
        this.g = k1o1.u(new r20(this, (lnm) null, (byte) 7));
        this.h = n3o1.r(this).c(mm1.Z0, mm1.a1);
        j2i j2iVar = new j2i(-1421458852, new r1(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public hf2(uep uepVar, vep vepVar, boolean z, cir0 cir0Var) {
        this.a = (byte) 2;
        this.d = uepVar;
        this.e = vepVar;
        this.b = z;
        this.f = cir0Var;
        this.g = k1o1.p();
        this.h = n3o1.q(this).a(c0z.R0, c0z.S0);
        j2i j2iVar = new j2i(-128832270, new yhy(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public hf2(yqg yqgVar, nwt nwtVar, clm clmVar, ubw0 ubw0Var, ubw0 ubw0Var2, ubw0 ubw0Var3, boolean z) {
        this.a = (byte) 3;
        this.d = ubw0Var;
        this.e = ubw0Var2;
        this.f = ubw0Var3;
        this.b = z;
        this.g = x3p1.n(new ozu0(this, clmVar, nwtVar, (byte) 7), p7w0.e, vbv0.e1, (o8n) null, new mwv0(this, (byte) 8), 8);
        j2i j2iVar = new j2i(-983774222, new t20(this, yqgVar, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(nzv0.X, nzv0.Y);
    }

    public hf2(jtl1 jtl1Var, sb7 sb7Var, boolean z, String str) {
        this.a = (byte) 4;
        this.d = jtl1Var;
        this.e = sb7Var;
        this.b = z;
        this.f = str;
        this.g = new rey0(new f2z0(this, (byte) 5));
        j2i j2iVar = new j2i(1471495041, new zyy0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(g2z0.t, g2z0.X);
    }

    public hf2(boolean z, lmq lmqVar, bpb1 bpb1Var) {
        this.a = (byte) 5;
        this.b = z;
        this.d = lmqVar;
        this.e = bpb1Var;
        this.f = new idd1(new h2y0(this, (byte) 28));
        this.g = k1o1.p();
        this.h = new eih1();
        j2i j2iVar = new j2i(13606203, new zyy0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
