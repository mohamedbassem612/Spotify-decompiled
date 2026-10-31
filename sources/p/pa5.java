package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pa5 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa5(boolean z, String str, Function0 function0, String str2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = str;
        this.d = function0;
        this.e = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1620503677);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                ven0 ven0VarM = k1u.m(idn0Var, x340Var, 0);
                tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
                tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
                qim0 qim0VarV = bin.v(qim0Var, idn0Var, null, this.b, this.c, null, this.d, 16);
                float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
                qim0 qim0VarK = d9y0.k(fj30.F(qim0VarV, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue());
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = k74.g;
                    x340Var.s0(objT2);
                }
                qim0 qim0VarN = anm1.N(str, s161.b(qim0VarK, false, (iu30) objT2));
                x340Var.r(false);
                return qim0VarN;
            default:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                boolean z = this.b;
                Function0 function0 = this.d;
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-1494748085);
                    boolean zG = x340Var3.g(function0);
                    Object objT3 = x340Var3.T();
                    if (zG || objT3 == m4cVar2) {
                        objT3 = new isr0(function0, (byte) 12);
                        x340Var3.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    String str2 = this.c;
                    if (ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(str2), function1);
                    Object objT4 = x340Var3.T();
                    if (objT4 == m4cVar2) {
                        objT4 = w0q0.X0;
                        x340Var3.s0(objT4);
                    }
                    vu30 vu30Var = (vu30) objT4;
                    Object objT5 = x340Var3.T();
                    if (objT5 == m4cVar2) {
                        objT5 = w0q0.Y0;
                        x340Var3.s0(objT5);
                    }
                    foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) objT5, (vu30) null, (hw61) null, 25), null, null, yla.s(x340Var3), null, null, null, null, null, z6j.a, x340Var3, 0, 48, 2012);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(-1494131619);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarD = eqr0.D(12.0f, 0.0f, 2, nim0.a);
                    boolean zG2 = x340Var4.g(function0);
                    Object objT6 = x340Var4.T();
                    if (zG2 || objT6 == m4cVar2) {
                        objT6 = new isr0(function0, (byte) 13);
                        x340Var4.s0(objT6);
                    }
                    Function0 function2 = (Function0) objT6;
                    if (ihc1.y0(str)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(str), function2), ldx.c, qim0VarD, null, null, null, false, null, null, z6j.b, x340Var4, 0, 6, 1016);
                    x340Var4.r(false);
                }
                return rih1.a;
        }
    }
}
