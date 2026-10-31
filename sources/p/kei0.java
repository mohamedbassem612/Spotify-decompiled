package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kei0 extends hab0 implements bv30 {
    public final /* synthetic */ idd1 X;
    public final /* synthetic */ gei0 a;
    public final /* synthetic */ aru0 b;
    public final /* synthetic */ gw70 c;
    public final /* synthetic */ tbw0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iuj g;
    public final /* synthetic */ idd1 h;
    public final /* synthetic */ idd1 i;
    public final /* synthetic */ idd1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kei0(gei0 gei0Var, aru0 aru0Var, gw70 gw70Var, tbw0 tbw0Var, Function0 function0, Function0 function1, iuj iujVar, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4) {
        super(5);
        this.a = gei0Var;
        this.b = aru0Var;
        this.c = gw70Var;
        this.d = tbw0Var;
        this.e = function0;
        this.f = function1;
        this.g = iujVar;
        this.h = idd1Var;
        this.i = idd1Var2;
        this.t = idd1Var3;
        this.X = idd1Var4;
    }

    @Override // p.bv30
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        hob1 hob1Var = (hob1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        String str = hob1Var.a;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(str);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = this.d.b((abu0) this.e.invoke(), (p731) null, (tl7) this.f.invoke());
            x340Var.s0(objT);
        }
        ubw0 ubw0Var = (ubw0) objT;
        sbw0 sbw0Var = hob1Var.y;
        if (sbw0Var == null) {
            x340Var.i0(1567303611);
            x340Var.r(false);
        } else {
            x340Var.i0(1567303612);
            x340Var.i0(1158938043);
            ubw0Var.e(kswVar, sbw0Var, x340Var, (iIntValue & 14) | 64);
            x340Var.r(false);
            x340Var.r(false);
        }
        float fW = upo1.w(x340Var, this.a.a.a);
        aru0 aru0Var = this.b;
        boolean zI = x340Var.i(aru0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new z6h0(aru0Var, (byte) 15);
            x340Var.s0(objT2);
        }
        znb0 znb0VarZ = ijo1.z(str, ubw0Var, (iu30) objT2, x340Var);
        bpb1 bpb1VarJ = ubw0Var.j();
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) xto.i(bpb1VarJ, bool, x340Var, 48).getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) xto.i(ubw0Var.c(), bool, x340Var, 48).getValue()).booleanValue();
        i091 i091Var = (i091) xto.i(ubw0Var.i(), (Object) null, x340Var, 48).getValue();
        mod.b(oi7.a.a(this.c), apo.r(211071246, new jei0(this.f, hob1Var, fW, iu30Var, this.g, this.h, this.i, this.t, this.X, zBooleanValue, zBooleanValue2, znb0VarZ, i091Var), x340Var), x340Var, 56);
        return rih1.a;
    }
}
