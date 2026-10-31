package p;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fhk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhk0(yfn0 yfn0Var) {
        super(2);
        this.a = (byte) 13;
        this.b = yfn0Var;
    }

    public static final void a(ven0 ven0Var) {
        ven0Var.setValue(Boolean.TRUE);
    }

    private final Object d(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        qio0 qio0Var = (qio0) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            tbr0 tbr0VarC = ((cir0) x340Var2.k(k2r0.a)).c();
            los losVar = qio0Var.c;
            boolean zI = x340Var2.i(qio0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new pio0(qio0Var, (byte) 1);
                x340Var2.s0(objT);
            }
            qxd0.i(losVar, (iu30) objT, x340Var2);
            boolean zI2 = x340Var2.i(tbr0VarC) | x340Var2.i(qio0Var);
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new s2n0(tbr0VarC, qio0Var, (byte) 21);
                x340Var2.s0(objT2);
            }
            zho1.l((Function0) objT2, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        String string;
        ioo0 ioo0Var = (ioo0) obj;
        koo0 koo0Var = (koo0) obj2;
        loo0 loo0Var = (loo0) this.b;
        int i = koo0Var.a;
        Resources resources = loo0Var.a;
        int i2 = 1;
        if (i == 1) {
            string = resources.getString(2131959182);
            string.getClass();
        } else {
            string = resources.getString(2131959183);
            string.getClass();
        }
        String str = string;
        String string2 = resources.getString(2131959180);
        if (!(ioo0Var instanceof hoo0)) {
            if (ioo0Var instanceof goo0) {
                i2 = 2;
            } else {
                if (!(ioo0Var instanceof foo0)) {
                    eg.o();
                    return null;
                }
                i2 = 3;
            }
        }
        return new joo0(i2, koo0Var.b, str, koo0Var.a, string2);
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            fra fraVar = een.N0;
            joo0 joo0Var = (joo0) this.b;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            jpx jpxVar = jpx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(jpxVar, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var2, jpx.d | 48, 56);
            cvx cvxVar = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.v(nim0Var, 8.0f));
            uwo1.e(joo0Var.b, (qim0) null, cbx.d(x340Var2).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            jqo0 jqo0Var = (jqo0) this.b;
            res resVar = jqo0Var.c;
            rro0 rro0Var = jqo0Var.b;
            otw.c(resVar, new qpo0(rro0Var.a, rro0Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v18 java.lang.Object, still in use, count: 2, list:
          (r12v18 java.lang.Object) from 0x0a2c: PHI (r12 I:??) = (r12v15 java.lang.Object), (r12v18 java.lang.Object) binds: [B:288:0x0a2a, B:416:0x0a2c] A[DONT_GENERATE, DONT_INLINE]
          (r12v18 java.lang.Object) from 0x0a23: CHECK_CAST (p.mks0) (r12v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fhk0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhk0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhk0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
