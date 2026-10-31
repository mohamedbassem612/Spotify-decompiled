package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tai0 extends hab0 implements bv30 {
    public final /* synthetic */ gw70 a;
    public final /* synthetic */ tbw0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ aru0 e;
    public final /* synthetic */ kko f;
    public final /* synthetic */ myq0 g;
    public final /* synthetic */ ycm h;
    public final /* synthetic */ aru0 i;
    public final /* synthetic */ iuj t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tai0(gw70 gw70Var, tbw0 tbw0Var, Function0 function0, Function0 function1, aru0 aru0Var, kko kkoVar, myq0 myq0Var, ycm ycmVar, aru0 aru0Var2, iuj iujVar) {
        super(5);
        this.a = gw70Var;
        this.b = tbw0Var;
        this.c = function0;
        this.d = function1;
        this.e = aru0Var;
        this.f = kkoVar;
        this.g = myq0Var;
        this.h = ycmVar;
        this.i = aru0Var2;
        this.t = iujVar;
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
            objT = this.b.b((abu0) this.c.invoke(), (p731) null, (tl7) this.d.invoke());
            x340Var.s0(objT);
        }
        ubw0 ubw0Var = (ubw0) objT;
        sbw0 sbw0Var = hob1Var.y;
        if (sbw0Var == null) {
            x340Var.i0(1817221985);
            x340Var.r(false);
        } else {
            x340Var.i0(1817221986);
            ubw0Var.e(kswVar, sbw0Var, x340Var, (iIntValue & 14) | 64);
            x340Var.r(false);
        }
        boolean zG2 = x340Var.g(str);
        Object objT2 = x340Var.T();
        kko kkoVar = this.f;
        if (zG2 || objT2 == obj6) {
            objT2 = new idd1(new sai0(this.e, kkoVar, (byte) 0));
            x340Var.s0(objT2);
        }
        znb0 znb0Var = (znb0) objT2;
        boolean zG3 = x340Var.g(str);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == obj6) {
            objT3 = new idd1(new pai0(kkoVar, (byte) 0));
            x340Var.s0(objT3);
        }
        znb0 znb0Var2 = (znb0) objT3;
        boolean zG4 = x340Var.g(str);
        Object objT4 = x340Var.T();
        if (zG4 || objT4 == obj6) {
            objT4 = new idd1(new qai0(this.g, (byte) 0));
            x340Var.s0(objT4);
        }
        znb0 znb0Var3 = (znb0) objT4;
        boolean zG5 = x340Var.g(str);
        Object objT5 = x340Var.T();
        if (zG5 || objT5 == obj6) {
            objT5 = new idd1(new oai0(this.h, (byte) 0));
            x340Var.s0(objT5);
        }
        znb0 znb0Var4 = (znb0) objT5;
        boolean zG6 = x340Var.g(str);
        Object objT6 = x340Var.T();
        if (zG6 || objT6 == obj6) {
            objT6 = new idd1(new rai0(this.i, ubw0Var, (byte) 0));
            x340Var.s0(objT6);
        }
        boolean zBooleanValue = ((Boolean) xto.i(ubw0Var.c(), Boolean.FALSE, x340Var, 48).getValue()).booleanValue();
        i091 i091Var = (i091) xto.i(ubw0Var.i(), (Object) null, x340Var, 48).getValue();
        mod.b(oi7.a.a(this.a), apo.r(-1807741008, new nai0(this.d, hob1Var, iu30Var, this.t, znb0Var, znb0Var2, znb0Var3, znb0Var4, zBooleanValue, (znb0) objT6, i091Var), x340Var), x340Var, 56);
        return rih1.a;
    }
}
