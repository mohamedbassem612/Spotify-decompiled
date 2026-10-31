package p;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(int i, int i2, ceo ceoVar) {
        super(1);
        this.a = (byte) 0;
        this.b = i;
        this.c = i2;
        this.d = ceoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ceo ceoVar = (ceo) obj2;
                pxg1 pxg1VarO0 = irn1.o0(i, 0, ceoVar, 2);
                pxg1 pxg1VarO1 = irn1.o0(i, 0, ceoVar, 2);
                int iC = l1d.C(i2);
                if (iC == 0) {
                    eg.m("None should not produce a ContentTransform");
                    return null;
                }
                if (iC == 1) {
                    return hm5.P(xay.e(2, pxg1VarO0), xay.f(2, pxg1VarO0));
                }
                if (iC == 2) {
                    return hm5.P(xay.m(pxg1VarO1, ft.Z), xay.q(pxg1VarO1, ft.N0));
                }
                if (iC == 3) {
                    return hm5.P(xay.e(2, pxg1VarO0).a(xay.m(pxg1VarO1, ft.O0)), xay.f(2, pxg1VarO0).a(xay.q(pxg1VarO1, ft.P0)));
                }
                eg.o();
                return null;
            case 1:
                qhl qhlVar = (qhl) obj;
                if (i2 != p7h.L((smc0) obj2)) {
                    qhlVar.setMargins(((ViewGroup.MarginLayoutParams) qhlVar).leftMargin, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, i, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin);
                }
                return rih1Var;
            case 2:
                ((Boolean) obj).booleanValue();
                ((iu30) obj2).invoke(new p6d1(i2, i));
                return rih1Var;
            case 3:
                qhl qhlVar2 = (qhl) obj;
                if (((View) obj2) == null) {
                    i2 = i;
                }
                qhlVar2.setMargins(i2, i, i, i);
                return rih1Var;
            default:
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject((ConstraintLayout) ((pqf1) obj2).U0.b, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(i2), Integer.valueOf(i));
                objectAnimatorOfObject.setDuration(480L);
                objectAnimatorOfObject.setStartDelay(300L);
                objectAnimatorOfObject.setInterpolator(new AccelerateInterpolator());
                objectAnimatorOfObject.start();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(int i, smc0 smc0Var, int i2) {
        super(1);
        this.a = (byte) 1;
        this.b = i;
        this.d = smc0Var;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e90(Object obj, int i, int i2, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
