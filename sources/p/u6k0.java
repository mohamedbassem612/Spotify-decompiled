package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u6k0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p6k0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6k0(p6k0 p6k0Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = p6k0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        p6k0 p6k0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                o6k0 o6k0Var = p6k0Var.a;
                boolean z = o6k0Var.h;
                boolean z2 = o6k0Var.i;
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(iu30Var);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new stj0(iu30Var, (byte) 9);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zG2 = x340Var.g(iu30Var);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new stj0(iu30Var, (byte) 10);
                    x340Var.s0(objT2);
                }
                e4p1.c(z, z2, function0, (Function0) objT2, (qim0) null, x340Var, 0);
                return rih1Var;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                o6k0 o6k0Var2 = p6k0Var.a;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 48);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                fq7.f(o6k0Var2.d, (qim0) null, (bby) null, (ln00) null, (String) null, u1j.b, x340Var2, 1572870, 30);
                fq7.f(o6k0Var2.f, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(602774397, new ipy(iu30Var, (byte) 22), x340Var2), x340Var2, 1572870, 30);
                x340Var4.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                o6k0 o6k0Var3 = p6k0Var.a;
                boolean z3 = o6k0Var3.h;
                boolean z4 = o6k0Var3.i;
                x340 x340Var5 = (b0k) obj2;
                boolean zG3 = x340Var5.g(iu30Var);
                Object objT3 = x340Var5.T();
                if (zG3 || objT3 == m4cVar2) {
                    objT3 = new stj0(iu30Var, (byte) 14);
                    x340Var5.s0(objT3);
                }
                Function0 function1 = (Function0) objT3;
                boolean zG4 = x340Var5.g(iu30Var);
                Object objT4 = x340Var5.T();
                if (zG4 || objT4 == m4cVar2) {
                    objT4 = new stj0(iu30Var, (byte) 15);
                    x340Var5.s0(objT4);
                }
                e4p1.c(z3, z4, function1, (Function0) objT4, (qim0) null, x340Var5, 0);
                return rih1Var;
        }
    }
}
