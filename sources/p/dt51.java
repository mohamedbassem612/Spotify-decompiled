package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dt51 extends hab0 implements vu30 {
    public final /* synthetic */ ps51 N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ xhl b;
    public final /* synthetic */ su c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt51(ven0 ven0Var, xhl xhlVar, su suVar, c380 c380Var, long j, long j2, iu30 iu30Var, Function0 function0, Function0 function1, boolean z, boolean z2, long j3, float f, ps51 ps51Var) {
        super(2);
        this.a = ven0Var;
        this.b = xhlVar;
        this.c = suVar;
        this.d = c380Var;
        this.e = j;
        this.f = j2;
        this.g = iu30Var;
        this.h = function0;
        this.i = function1;
        this.t = z;
        this.X = z2;
        this.Y = j3;
        this.Z = f;
        this.N0 = ps51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue() & 11;
        rih1 rih1Var = rih1.a;
        if (iIntValue == 2) {
            x340 x340Var2 = x340Var;
            if (x340Var2.H()) {
                x340Var2.b0();
                return rih1Var;
            }
        }
        this.a.setValue(rih1Var);
        xhl xhlVar = this.b;
        int i = ((uhl) xhlVar).b;
        xhlVar.m();
        x340 x340Var3 = x340Var;
        x340Var3.i0(-423438906);
        xhl xhlVar2 = (xhl) xhlVar.l().b;
        ihl ihlVarK = xhlVar2.k();
        ihl ihlVarK2 = xhlVar2.k();
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = wp51.X0;
            x340Var3.s0(objT);
        }
        nim0 nim0Var = nim0.a;
        ft51.d(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, xhl.j(nim0Var, ihlVarK2, (iu30) objT), x340Var3, 0, 0);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        boolean zI = x340Var3.i(ihlVarK2);
        Object objT2 = x340Var3.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new pu(ihlVarK2, (byte) 27);
            x340Var3.s0(objT2);
        }
        ft51.k(this.f, this.e, this.N0, xhl.j(qim0VarF, ihlVarK, (iu30) objT2), x340Var3, 0);
        x340Var3.r(false);
        if (((uhl) xhlVar).b != i) {
            qxd0.S(this.c, x340Var3);
        }
        return rih1Var;
    }
}
