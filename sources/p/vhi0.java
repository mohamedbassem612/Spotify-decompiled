package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vhi0 extends hab0 implements bv30 {
    public final /* synthetic */ e9g1 N0;
    public final /* synthetic */ iuj O0;
    public final /* synthetic */ yqg P0;
    public final /* synthetic */ aru0 X;
    public final /* synthetic */ cua Y;
    public final /* synthetic */ n801 Z;
    public final /* synthetic */ ohi0 a;
    public final /* synthetic */ gw70 b;
    public final /* synthetic */ tbw0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ p731 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ aru0 g;
    public final /* synthetic */ kko h;
    public final /* synthetic */ myq0 i;
    public final /* synthetic */ ycm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhi0(ohi0 ohi0Var, gw70 gw70Var, tbw0 tbw0Var, Function0 function0, p731 p731Var, Function0 function1, aru0 aru0Var, kko kkoVar, myq0 myq0Var, ycm ycmVar, aru0 aru0Var2, cua cuaVar, n801 n801Var, e9g1 e9g1Var, iuj iujVar, yqg yqgVar) {
        super(5);
        this.a = ohi0Var;
        this.b = gw70Var;
        this.c = tbw0Var;
        this.d = function0;
        this.e = p731Var;
        this.f = function1;
        this.g = aru0Var;
        this.h = kkoVar;
        this.i = myq0Var;
        this.t = ycmVar;
        this.X = aru0Var2;
        this.Y = cuaVar;
        this.Z = n801Var;
        this.N0 = e9g1Var;
        this.O0 = iujVar;
        this.P0 = yqgVar;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        hob1 hob1Var = (hob1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        Object obj6 = fkj0.X;
        String str = hob1Var.a;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(str);
        Object objT = x340Var.T();
        if (zG || objT == obj6) {
            objT = this.c.b((abu0) this.d.invoke(), this.e, (tl7) this.f.invoke());
            x340Var.s0(objT);
        }
        ubw0 ubw0Var = (ubw0) objT;
        sbw0 sbw0Var = hob1Var.y;
        if (sbw0Var == null) {
            x340Var.i0(-1401343976);
        } else {
            x340Var.i0(-1401343975);
            ubw0Var.e(kswVar, sbw0Var, x340Var, (iIntValue & 14) | 64);
        }
        x340Var.r(false);
        float fW = upo1.w(x340Var, this.a.a.a);
        boolean zG2 = x340Var.g(str);
        Object objT2 = x340Var.T();
        kko kkoVar = this.h;
        if (zG2 || objT2 == obj6) {
            objT2 = new idd1(new sai0(this.g, kkoVar, (byte) 4));
            x340Var.s0(objT2);
        }
        znb0 znb0Var = (znb0) objT2;
        boolean zG3 = x340Var.g(str);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == obj6) {
            objT3 = new idd1(new pai0(kkoVar, (byte) 2));
            x340Var.s0(objT3);
        }
        znb0 znb0Var2 = (znb0) objT3;
        boolean zG4 = x340Var.g(str);
        Object objT4 = x340Var.T();
        if (zG4 || objT4 == obj6) {
            objT4 = new idd1(new qai0(this.i, (byte) 3));
            x340Var.s0(objT4);
        }
        znb0 znb0Var3 = (znb0) objT4;
        boolean zG5 = x340Var.g(str);
        Object objT5 = x340Var.T();
        if (zG5 || objT5 == obj6) {
            idd1 idd1Var = new idd1(new oai0(this.t, (byte) 3));
            x340Var.s0(idd1Var);
            objT5 = idd1Var;
        }
        znb0 znb0Var4 = (znb0) objT5;
        boolean zG6 = x340Var.g(str);
        Object objT6 = x340Var.T();
        if (zG6 || objT6 == obj6) {
            objT6 = new idd1(new rai0(this.X, ubw0Var, (byte) 2));
            x340Var.s0(objT6);
        }
        znb0 znb0Var5 = (znb0) objT6;
        boolean zG7 = x340Var.g(str);
        Object objT7 = x340Var.T();
        if (zG7 || objT7 == obj6) {
            objT7 = new idd1(new vbi0(this.Y, ubw0Var, (byte) 1));
            x340Var.s0(objT7);
        }
        znb0 znb0Var6 = (znb0) objT7;
        Object objT8 = x340Var.T();
        if (objT8 == obj6) {
            objT8 = xto.t(Boolean.FALSE);
            x340Var.s0(objT8);
        }
        ven0 ven0Var = (ven0) objT8;
        boolean zI = x340Var.i(ven0Var);
        Object objT9 = x340Var.T();
        if (zI || objT9 == obj6) {
            objT9 = new abh0(ven0Var, (byte) 7);
            x340Var.s0(objT9);
        }
        rih1 rih1Var = rih1.a;
        qxd0.i(rih1Var, (iu30) objT9, x340Var);
        boolean zG8 = x340Var.g(str) | x340Var.g(ubw0Var);
        Object objT10 = x340Var.T();
        if (zG8 || objT10 == obj6) {
            idd1 idd1Var2 = new idd1(new dt90(this.Z, ubw0Var, ven0Var, (byte) 22));
            x340Var.s0(idd1Var2);
            objT10 = idd1Var2;
        }
        znb0 znb0Var7 = (znb0) objT10;
        boolean zG9 = x340Var.g(str);
        Object objT11 = x340Var.T();
        if (zG9 || objT11 == obj6) {
            objT11 = new idd1(new wbi0(this.N0, (byte) 1));
            x340Var.s0(objT11);
        }
        znb0 znb0Var8 = (znb0) objT11;
        bpb1 bpb1VarJ = ubw0Var.j();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) xto.i(bpb1VarJ, bool, x340Var, 48).getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) xto.i(ubw0Var.c(), bool, x340Var, 48).getValue()).booleanValue();
        i091 i091Var = (i091) xto.i(ubw0Var.i(), (Object) null, x340Var, 48).getValue();
        boolean z = hob1Var.A;
        qim0 qim0VarW = nim0.a;
        if (z) {
            x340Var.i0(-1399211485);
            x340Var.r(false);
        } else {
            x340Var.i0(-1399181880);
            boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT12 = x340Var.T();
            if (z2 || objT12 == obj6) {
                objT12 = new mhg0(iu30Var, (byte) 22);
                x340Var.s0(objT12);
            }
            qim0VarW = jzn1.w(qim0VarW, (iu30) objT12, x340Var);
            x340Var.r(false);
        }
        mod.b(oi7.a.a(this.b), apo.r(1190027817, new uhi0(znb0Var7, hob1Var, fW, iu30Var, this.O0, znb0Var, znb0Var2, znb0Var3, znb0Var4, zBooleanValue, qim0VarW, zBooleanValue2, znb0Var5, znb0Var6, znb0Var8, this.P0, i091Var, ubw0Var, ven0Var), x340Var), x340Var, 56);
        return rih1Var;
    }
}
