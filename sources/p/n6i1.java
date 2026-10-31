package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n6i1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n6i1(j2i j2iVar, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = j2iVar;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        gex0 gex0Var = h36.a;
        nim0 nim0Var = nim0.a;
        Function0 function0 = this.c;
        j2i j2iVar = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(x340Var, 0);
                ldx ldxVar = ldx.c;
                boolean zG = x340Var3.g(function0);
                Object objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    objT = new sah1(function0, (byte) 7);
                    x340Var3.s0(objT);
                }
                wro1.h(new gbx(z50Var, (Function0) objT), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, lpj.a, x340Var, 0, 6, 1020);
                x340Var3.r(true);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                j2iVar.invoke(x340Var4, 0);
                ldx ldxVar2 = ldx.c;
                boolean zG2 = x340Var6.g(function0);
                Object objT2 = x340Var6.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new sah1(function0, (byte) 8);
                    x340Var6.s0(objT2);
                }
                wro1.h(new gbx(z50Var, (Function0) objT2), ldxVar2, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, lpj.b, x340Var4, 0, 6, 1020);
                x340Var6.r(true);
                return rih1Var;
        }
    }
}
