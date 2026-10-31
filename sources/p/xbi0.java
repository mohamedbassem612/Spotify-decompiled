package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xbi0 extends hab0 implements bv30 {
    public final /* synthetic */ klv0 N0;
    public final /* synthetic */ iuj O0;
    public final /* synthetic */ yqg P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ cua X;
    public final /* synthetic */ e9g1 Y;
    public final /* synthetic */ tiv0 Z;
    public final /* synthetic */ har0 a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ tbw0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ aru0 f;
    public final /* synthetic */ kko g;
    public final /* synthetic */ myq0 h;
    public final /* synthetic */ ycm i;
    public final /* synthetic */ aru0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbi0(har0 har0Var, gw70 gw70Var, tbw0 tbw0Var, Function0 function0, Function0 function1, aru0 aru0Var, kko kkoVar, myq0 myq0Var, ycm ycmVar, aru0 aru0Var2, cua cuaVar, e9g1 e9g1Var, tiv0 tiv0Var, klv0 klv0Var, iuj iujVar, yqg yqgVar, boolean z) {
        super(5);
        this.a = har0Var;
        this.b = gw70Var;
        this.c = tbw0Var;
        this.d = function0;
        this.e = function1;
        this.f = aru0Var;
        this.g = kkoVar;
        this.h = myq0Var;
        this.i = ycmVar;
        this.t = aru0Var2;
        this.X = cuaVar;
        this.Y = e9g1Var;
        this.Z = tiv0Var;
        this.N0 = klv0Var;
        this.O0 = iujVar;
        this.P0 = yqgVar;
        this.Q0 = z;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        iob1 iob1Var = (iob1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        Object obj6 = fkj0.X;
        hob1 hob1VarV = too1.v(iob1Var);
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(iob1Var.a());
        Object objT = x340Var.T();
        if (zG || objT == obj6) {
            objT = this.c.b((abu0) this.d.invoke(), (p731) null, (tl7) this.e.invoke());
            x340Var.s0(objT);
        }
        ubw0 ubw0Var = (ubw0) objT;
        sbw0 sbw0VarB = iob1Var.b();
        x340Var.i0(2044023956);
        ubw0Var.e(kswVar, sbw0VarB, x340Var, (iIntValue & 14) | 64);
        x340Var.r(false);
        boolean zBooleanValue = ((Boolean) xto.i(ubw0Var.c(), Boolean.FALSE, x340Var, 48).getValue()).booleanValue();
        i091 i091Var = (i091) xto.i(ubw0Var.i(), (Object) null, x340Var, 48).getValue();
        float fW = upo1.w(x340Var, this.a.a);
        boolean zG2 = x340Var.g(iob1Var.a());
        Object objT2 = x340Var.T();
        kko kkoVar = this.g;
        if (zG2 || objT2 == obj6) {
            objT2 = new idd1(new sai0(this.f, kkoVar, (byte) 1));
            x340Var.s0(objT2);
        }
        znb0 znb0Var = (znb0) objT2;
        boolean zG3 = x340Var.g(iob1Var.a());
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == obj6) {
            objT3 = new idd1(new pai0(kkoVar, (byte) 1));
            x340Var.s0(objT3);
        }
        znb0 znb0Var2 = (znb0) objT3;
        boolean zG4 = x340Var.g(iob1Var.a());
        Object objT4 = x340Var.T();
        if (zG4 || objT4 == obj6) {
            objT4 = new idd1(new qai0(this.h, (byte) 1));
            x340Var.s0(objT4);
        }
        znb0 znb0Var3 = (znb0) objT4;
        boolean zG5 = x340Var.g(iob1Var.a());
        Object objT5 = x340Var.T();
        if (zG5 || objT5 == obj6) {
            objT5 = new idd1(new oai0(this.i, (byte) 1));
            x340Var.s0(objT5);
        }
        znb0 znb0Var4 = (znb0) objT5;
        boolean zG6 = x340Var.g(iob1Var.a());
        Object objT6 = x340Var.T();
        if (zG6 || objT6 == obj6) {
            idd1 idd1Var = new idd1(new rai0(this.t, ubw0Var, (byte) 1));
            x340Var.s0(idd1Var);
            objT6 = idd1Var;
        }
        znb0 znb0Var5 = (znb0) objT6;
        boolean zG7 = x340Var.g(iob1Var.a());
        Object objT7 = x340Var.T();
        if (zG7 || objT7 == obj6) {
            objT7 = new idd1(new vbi0(this.X, ubw0Var, (byte) 0));
            x340Var.s0(objT7);
        }
        znb0 znb0Var6 = (znb0) objT7;
        boolean zG8 = x340Var.g(iob1Var.a());
        Object objT8 = x340Var.T();
        if (zG8 || objT8 == obj6) {
            objT8 = new idd1(new wbi0(this.Y, (byte) 0));
            x340Var.s0(objT8);
        }
        znb0 znb0Var7 = (znb0) objT8;
        boolean zG9 = x340Var.g(iob1Var.a());
        Object objT9 = x340Var.T();
        if (zG9 || objT9 == obj6) {
            objT9 = iob1Var.c() ? new idd1(new dvg0(this.Z, this.N0, (byte) 4)) : null;
            x340Var.s0(objT9);
        } else {
            iob1Var = iob1Var;
            fW = fW;
        }
        znb0 znb0Var8 = (znb0) objT9;
        boolean zG10 = x340Var.g(iob1Var.a());
        Object objT10 = x340Var.T();
        if (zG10 || objT10 == obj6) {
            objT10 = iob1Var.c() ? new idd1(z7i0.d) : null;
            x340Var.s0(objT10);
        }
        iob1 iob1Var2 = iob1Var;
        mod.b(oi7.a.a(this.b), apo.r(-756825492, new ubi0(iob1Var2, znb0Var5, znb0Var6, hob1VarV, znb0Var7, iu30Var, fW, this.O0, znb0Var, znb0Var2, znb0Var3, znb0Var4, zBooleanValue, (znb0) objT10, znb0Var8, this.P0, i091Var, this.Q0), x340Var), x340Var, 56);
        return rih1.a;
    }
}
