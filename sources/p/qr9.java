package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qr9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ or9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr9(Function0 function0, or9 or9Var, byte b) {
        super(3);
        this.a = b;
        this.b = function0;
        this.c = or9Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-1718638290);
                float fX0 = ((wat) x340Var.k(t4k.h)).X0(90.0f);
                ven0 ven0VarS = v8r.s(function0, x340Var);
                Object objT = x340Var.T();
                Object obj4 = fkj0.X;
                if (objT == obj4) {
                    objT = qxd0.M(o6xVar, x340Var);
                    x340Var.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                Object objT2 = x340Var.T();
                if (objT2 == obj4) {
                    objT2 = er31.d(24.0f, 24.0f, 0.0f, 0.0f, 12);
                    x340Var.s0(objT2);
                }
                cr31 cr31Var = (cr31) objT2;
                or9 or9Var = this.c;
                boolean zG = x340Var.g(or9Var) | x340Var.d(fX0);
                Object objT3 = x340Var.T();
                if (zG || objT3 == obj4) {
                    objT3 = new pr9(or9Var, fX0, c9nVar, ven0VarS);
                    x340Var.s0(objT3);
                }
                pr9 pr9Var = (pr9) objT3;
                boolean zI = x340Var.i(or9Var);
                Object objT4 = x340Var.T();
                if (zI || objT4 == obj4) {
                    objT4 = new mr9(or9Var, (byte) 1);
                    x340Var.s0(objT4);
                }
                qim0 qim0VarL = bmq0.L(lrn1.u(qim0Var, (iu30) objT4), pr9Var, (g6o0) null);
                boolean zI2 = x340Var.i(or9Var) | x340Var.i(cr31Var);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == obj4) {
                    objT5 = new kd8(or9Var, cr31Var, (byte) 8);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarC = i541.C(qim0VarL, (iu30) objT5);
                x340Var.r(false);
                return qim0VarC;
            default:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-520519575);
                float fX1 = ((wat) x340Var2.k(t4k.h)).X0(90.0f);
                ven0 ven0VarS2 = v8r.s(function0, x340Var2);
                Object objT6 = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT6 == m4cVar) {
                    objT6 = qxd0.M(o6xVar, x340Var2);
                    x340Var2.s0(objT6);
                }
                c9n c9nVar2 = (c9n) objT6;
                Object objT7 = x340Var2.T();
                if (objT7 == m4cVar) {
                    objT7 = new tui1();
                    x340Var2.s0(objT7);
                }
                tui1 tui1Var = (tui1) objT7;
                Float fValueOf = Float.valueOf(fX1);
                boolean zI3 = x340Var2.i(tui1Var);
                or9 or9Var2 = this.c;
                boolean zI4 = x340Var2.i(or9Var2) | zI3 | x340Var2.d(fX1) | x340Var2.i(c9nVar2) | x340Var2.i(ven0VarS2);
                Object objT8 = x340Var2.T();
                if (zI4 || objT8 == m4cVar) {
                    sr9 sr9Var = new sr9(tui1Var, or9Var2, fX1, c9nVar2, ven0VarS2);
                    x340Var2.s0(sr9Var);
                    objT8 = sr9Var;
                }
                qim0 qim0VarC2 = f8d1.c(qim0Var2, or9Var2, fValueOf, (PointerInputEventHandler) objT8);
                x340Var2.r(false);
                return qim0VarC2;
        }
    }
}
