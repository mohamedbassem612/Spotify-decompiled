package p;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class obs0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qbs0 b;
    public final /* synthetic */ ComposeView c;
    public final /* synthetic */ tob1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obs0(qbs0 qbs0Var, ComposeView composeView, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = qbs0Var;
        this.c = composeView;
        this.d = tob1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.d;
        ComposeView composeView = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ecs0 ecs0Var = (ecs0) tob1Var.getValue();
                    boolean z = ecs0Var instanceof ccs0;
                    qbs0 qbs0Var = this.b;
                    if (z) {
                        x340Var2.i0(1739560697);
                        boolean zI = x340Var2.i(qbs0Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            wao0 wao0Var = new wao0(1, qbs0Var, qbs0.class, "handleProceedStateViewEvent", "handleProceedStateViewEvent(Lcom/spotify/payment/paymentimpl/view/ProceedStateViewEvent;)V", 0, (byte) 20);
                            x340Var2.s0(wao0Var);
                            objT = wao0Var;
                        }
                        iu30 iu30Var = (nla0) objT;
                        boolean zI2 = x340Var2.i(qbs0Var);
                        Object objT2 = x340Var2.T();
                        if (zI2 || objT2 == m4cVar) {
                            wao0 wao0Var2 = new wao0(1, qbs0Var, qbs0.class, "handlePaymentOptionEvent", "handlePaymentOptionEvent(Lcom/spotify/payment/paymentimpl/view/PaymentOptionEvent;)V", 0, (byte) 19);
                            x340Var2.s0(wao0Var2);
                            objT2 = wao0Var2;
                        }
                        ccs0 ccs0Var = (ccs0) ecs0Var;
                        iu30 iu30Var2 = iu30Var;
                        iu30 iu30Var3 = (nla0) objT2;
                        boolean zI3 = x340Var2.i(qbs0Var);
                        Object objT3 = x340Var2.T();
                        if (zI3 || objT3 == m4cVar) {
                            objT3 = new nbs0(qbs0Var, (byte) 1);
                            x340Var2.s0(objT3);
                        }
                        Function0 function0 = (Function0) objT3;
                        hrr0 hrr0Var = qbs0Var.Q1;
                        boolean zI4 = x340Var2.i(qbs0Var);
                        Object objT4 = x340Var2.T();
                        if (zI4 || objT4 == m4cVar) {
                            objT4 = new nbs0(qbs0Var, (byte) 2);
                            x340Var2.s0(objT4);
                        }
                        Function0 function1 = (Function0) objT4;
                        boolean zI5 = x340Var2.i(qbs0Var);
                        Object objT5 = x340Var2.T();
                        if (zI5 || objT5 == m4cVar) {
                            objT5 = new nbs0(qbs0Var, (byte) 3);
                            x340Var2.s0(objT5);
                        }
                        Function0 function2 = (Function0) objT5;
                        xbs0 xbs0VarH = ccs0Var.h();
                        c380 c380Var = xbs0VarH != null ? xbs0VarH.i : null;
                        if (c380Var == null) {
                            c380Var = z6x.a;
                        }
                        c380 c380VarA = mqo1.A(o7h.N0(ccs0Var.Y, (Collection) c380Var));
                        t2c0 t2c0Var = ccs0Var.O0;
                        boolean zI6 = x340Var2.i(qbs0Var);
                        Object objT6 = x340Var2.T();
                        if (zI6 || objT6 == m4cVar) {
                            objT6 = new nso0(qbs0Var, (byte) 23);
                            x340Var2.s0(objT6);
                        }
                        vu30 vu30Var = (vu30) objT6;
                        dt71 dt71Var = qbs0Var.R1;
                        dt71 dt71Var2 = qbs0Var.S1;
                        boolean zI7 = x340Var2.i(qbs0Var);
                        Object objT7 = x340Var2.T();
                        if (zI7 || objT7 == m4cVar) {
                            t0r0 t0r0Var = new t0r0(0, qbs0Var, qbs0.class, "dismissPaintedDoorDialog", "dismissPaintedDoorDialog()V", 0, (byte) 19);
                            x340Var2.s0(t0r0Var);
                            objT7 = t0r0Var;
                        }
                        yoo1.l(ccs0Var, iu30Var2, iu30Var3, function0, hrr0Var, function1, function2, c380VarA, t2c0Var, vu30Var, dt71Var, dt71Var2, (Function0) objT7, (qim0) null, (gpv0) ((hrr0) qbs0Var.T1.c).getValue(), x340Var2, 0);
                        x340Var2.r(false);
                    } else if (ecs0Var instanceof bcs0) {
                        x340Var2.i0(-82386231);
                        Context context = composeView.getContext();
                        boolean zI8 = x340Var2.i(qbs0Var);
                        Object objT8 = x340Var2.T();
                        if (zI8 || objT8 == m4cVar) {
                            objT8 = new nbs0(qbs0Var, (byte) 4);
                            x340Var2.s0(objT8);
                        }
                        l3p1.m(context, (Function0) objT8, ((bcs0) ecs0Var).f, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (!(ecs0Var instanceof dcs0)) {
                            throw p3d1.k(x340Var2, -82434415, false);
                        }
                        x340Var2.i0(-82378507);
                        epo1.n((qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    kiv kivVar = oi7.a;
                    qbs0 qbs0Var2 = this.b;
                    ynb0 ynb0Var = qbs0Var2.V1;
                    if (ynb0Var == null) {
                        u890.C("imageLoader");
                        throw null;
                    }
                    mod.b(kivVar.a(ynb0Var.get()), apo.r(437902558, new obs0(qbs0Var2, composeView, tob1Var, b2), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
