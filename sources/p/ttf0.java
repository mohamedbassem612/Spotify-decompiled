package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ttf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttf0(hob1 hob1Var, j2i j2iVar, Function0 function0, Function0 function1, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, float f, int i) {
        super(2);
        this.b = hob1Var;
        this.c = j2iVar;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
        this.g = vu30Var;
        this.h = vu30Var2;
        this.i = vu30Var3;
        this.t = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    hob1 hob1Var = this.b;
                    long jN = bth.n((cr00) hob1Var.h, x340Var2);
                    qim0 qim0VarO = bth.o(u291.f(uyn1.B(this.f, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), this.t, hob1Var.h);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0VarO, er31.b(8.0f)), jN, d4o1.a);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var2);
                    }
                    idn0 idn0Var = (idn0) objT;
                    jtr jtrVar = jtr.c;
                    pm31 pm31Var = new pm31(0);
                    Function0 function0 = this.d;
                    boolean zG = x340Var2.g(function0);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new tze0(function0, (byte) 5);
                        x340Var2.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    Function0 function2 = this.e;
                    boolean zG2 = x340Var2.g(function2);
                    Object objT3 = x340Var2.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new tze0(function2, (byte) 6);
                        x340Var2.s0(objT3);
                    }
                    qim0 qim0VarN = anm1.N("cardClickableArea", bin.y(qim0VarF, idn0Var, jtrVar, false, (String) null, pm31Var, (String) null, function1, (Function0) objT3, 428));
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, nim0.a);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    this.c.invoke(x340Var2, 0);
                    nb51.l(this.i, x340Var2, 0);
                    x340Var2.r(true);
                    bth.c(null, this.g, this.h, false, x340Var2, 0, 9);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                nb51.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(14352433));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttf0(hob1 hob1Var, qim0 qim0Var, float f, Function0 function0, Function0 function1, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, vu30 vu30Var3) {
        super(2);
        this.b = hob1Var;
        this.f = qim0Var;
        this.t = f;
        this.d = function0;
        this.e = function1;
        this.g = vu30Var;
        this.h = vu30Var2;
        this.c = j2iVar;
        this.i = vu30Var3;
    }
}
