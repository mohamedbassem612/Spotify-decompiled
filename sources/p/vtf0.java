package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vtf0 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtf0(qim0 qim0Var, pgx pgxVar, boolean z, boolean z2, ven0 ven0Var, rwi0 rwi0Var, Function0 function0, ven0 ven0Var2, Function0 function1, Function0 function2) {
        super(3);
        this.d = qim0Var;
        this.e = pgxVar;
        this.b = z;
        this.c = z2;
        this.f = ven0Var;
        this.g = rwi0Var;
        this.h = function0;
        this.i = ven0Var2;
        this.t = function1;
        this.X = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.X;
        Function0 function0 = this.t;
        Object obj5 = this.i;
        Function0 function1 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                cbx.a.getClass();
                float f = uwr.d().a * 240.0f;
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = bb00.h(0, x340Var);
                }
                err0 err0Var = (hdn0) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = bb00.h(0, x340Var);
                }
                hdn0 hdn0Var = (hdn0) objT2;
                double d = ((double) (i2cVar.d() - f)) / 2.0d;
                double dM0 = d - ((double) ((wat) x340Var.k(t4k.h)).M0(err0Var.s()));
                i091 i091Var = (i091) obj9;
                boolean zP = i091Var != null ? ebp1.p(i091Var) : false;
                ((j2i) obj8).invoke(x340Var, 0);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = i2cVar.b(nim0Var);
                j2i j2iVar = (j2i) obj7;
                j2i j2iVar2 = (j2i) obj6;
                vu30 vu30Var = (vu30) obj5;
                hob1 hob1Var = (hob1) obj4;
                vu30 vu30Var2 = (vu30) function0;
                j2i j2iVar3 = (j2i) function1;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                boolean z = (!this.b || zP || this.c) ? false : true;
                ceo ceoVar = bth.a;
                fq7.b(pbh.a, z, qim0VarD, xay.e(2, irn1.o0(500, 0, new ceo(0.3f, 0.0f, 0.4f, 1.0f), 2)), ln00.b, (String) null, apo.r(-1542842169, new utf0(d, dM0, err0Var, j2iVar, j2iVar2, vu30Var, hob1Var, vu30Var2, hdn0Var, j2iVar3), x340Var), x340Var, 1572870, 16);
                x340Var.r(true);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                cr31 cr31VarB = er31.b(16.0f);
                cvx cvxVar = cbx.b(b0kVar).b;
                cwl1.b((qim0) obj9, (tl3) null, cr31VarB, (pgx) obj8, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, this.b, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1234628802, new pnv(this.c, (ven0) obj7, (rwi0) obj6, function1, (ven0) obj5, function0, (Function0) obj4, (byte) 2), b0kVar), b0kVar, 0, 48, 1954);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtf0(i091 i091Var, j2i j2iVar, boolean z, boolean z2, j2i j2iVar2, j2i j2iVar3, vu30 vu30Var, hob1 hob1Var, vu30 vu30Var2, j2i j2iVar4) {
        super(3);
        this.d = i091Var;
        this.e = j2iVar;
        this.b = z;
        this.c = z2;
        this.f = j2iVar2;
        this.g = j2iVar3;
        this.i = vu30Var;
        this.X = hob1Var;
        this.t = vu30Var2;
        this.h = j2iVar4;
    }
}
