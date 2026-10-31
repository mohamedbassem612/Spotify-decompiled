package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gsy0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ xhl b;
    public final /* synthetic */ su c;
    public final /* synthetic */ nyn1 d;
    public final /* synthetic */ vgo1 e;
    public final /* synthetic */ cm10 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ wd50 i;
    public final /* synthetic */ jtl1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsy0(ven0 ven0Var, xhl xhlVar, su suVar, nyn1 nyn1Var, vgo1 vgo1Var, cm10 cm10Var, Function0 function0, Function0 function1, wd50 wd50Var, jtl1 jtl1Var, String str, String str2, String str3, Function0 function2, boolean z) {
        super(2);
        this.a = ven0Var;
        this.b = xhlVar;
        this.c = suVar;
        this.d = nyn1Var;
        this.e = vgo1Var;
        this.f = cm10Var;
        this.g = function0;
        this.h = function1;
        this.i = wd50Var;
        this.t = jtl1Var;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.N0 = function2;
        this.O0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006a  */
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
        x340Var3.i0(-1061949889);
        xhl xhlVar2 = (xhl) xhlVar.l().b;
        ihl ihlVarK = xhlVar2.k();
        ihl ihlVarK2 = xhlVar2.k();
        ihl ihlVarK3 = xhlVar2.k();
        ihl ihlVarK4 = xhlVar2.k();
        ihl ihlVarK5 = xhlVar2.k();
        ihl ihlVarK6 = xhlVar2.k();
        ihl ihlVarK7 = xhlVar2.k();
        bgr0 bgr0Var = bgr0.c;
        nyn1 nyn1Var = this.d;
        boolean z = false;
        if (nyn1Var.equals(bgr0Var)) {
            z = true;
        } else {
            if (!(nyn1Var instanceof agr0)) {
                eg.o();
                return null;
            }
            if (((agr0) nyn1Var).c > 0) {
                z = true;
            }
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = ucy0.S0;
            x340Var3.s0(objT);
        }
        qim0 qim0VarJ = xhl.j(qim0VarF, ihlVarK2, (iu30) objT);
        vgo1 vgo1Var = this.e;
        cm10 cm10Var = this.f;
        i1o1.c(vgo1Var, cm10Var, z, this.g, this.h, qim0VarJ, x340Var3, 64, 0);
        wd50 wd50Var = this.i;
        yon1 yon1Var = wd50Var.a;
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        boolean zG = x340Var3.g(ihlVarK2);
        Object objT2 = x340Var3.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new pu(ihlVarK2, (byte) 23);
            x340Var3.s0(objT2);
        }
        l6o1.i(yon1Var, this.t, xhl.j(qim0VarF2, ihlVarK3, (iu30) objT2), x340Var3, 0);
        l6o1.h(xhlVar, wd50Var.b, ihlVarK, ihlVarK5, ihlVarK3, ihlVarK6, ihlVarK4, ihlVarK7, x340Var3, 8);
        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        qim0 qim0VarF4 = dug.f(qim0VarF3, cbx.a(x340Var3).a.c, d4o1.a);
        Object objT3 = x340Var3.T();
        if (objT3 == m4cVar) {
            objT3 = ucy0.T0;
            x340Var3.s0(objT3);
        }
        qim0 qim0VarJ2 = xhl.j(qim0VarF4, ihlVarK4, (iu30) objT3);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var3, qim0VarJ2);
        hzj.A.getClass();
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var3, y580.O0);
        nko1.H(xos0VarM, x340Var3, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
        nko1.F(x340Var3);
        nko1.H(qim0VarE, x340Var3, y580.Y);
        l6o1.e(this.X, this.Y, this.Z, cm10Var, this.N0, (qim0) null, this.O0, x340Var3, 32774);
        if (nyn1Var instanceof agr0) {
            x340Var3.i0(-1040385598);
            agr0 agr0Var = (agr0) nyn1Var;
            sjo0.a(agr0Var.d, agr0Var.c, 384, x340Var3, uyn1.B(nim0Var, 0.0f, 32.0f, 0.0f, 0.0f, 13));
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1040197242);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        x340Var3.r(false);
        if (((uhl) xhlVar).b != i) {
            qxd0.S(this.c, x340Var3);
        }
        return rih1Var;
    }
}
