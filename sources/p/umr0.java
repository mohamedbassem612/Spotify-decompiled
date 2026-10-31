package p;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class umr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xfx b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ umr0(xfx xfxVar, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = xfxVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        xfx xfxVar = this.b;
        switch (b) {
            case 0:
                ljr ljrVar = new ljr(xfxVar.b.a);
                ljrVar.n(iu30Var);
                ConstraintLayout constraintLayout = (ConstraintLayout) ljrVar.b.b;
                constraintLayout.setTag(ljrVar);
                return constraintLayout;
            case 1:
                ljr ljrVar2 = new ljr(xfxVar.b.a);
                ljrVar2.n(iu30Var);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ljrVar2.b.b;
                constraintLayout2.setTag(ljrVar2);
                return constraintLayout2;
            case 2:
                avr avrVar = new avr(xfxVar.c.b);
                avrVar.n(iu30Var);
                LinearLayout linearLayout = (LinearLayout) avrVar.a.b;
                linearLayout.setTag(avrVar);
                return linearLayout;
            case 3:
                xyr xyrVar = new xyr(xfxVar.b.a);
                xyrVar.n(iu30Var);
                LinearLayout linearLayout2 = (LinearLayout) xyrVar.a.b;
                linearLayout2.setTag(xyrVar);
                return linearLayout2;
            case 4:
                ses sesVar = new ses(xfxVar.b.a);
                sesVar.n(iu30Var);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) sesVar.a.c;
                constraintLayout3.setTag(sesVar);
                return constraintLayout3;
            case 5:
                yps ypsVar = new yps(xfxVar.b.a);
                ypsVar.n(iu30Var);
                LinearLayout linearLayout3 = ypsVar.b.a;
                linearLayout3.setTag(ypsVar);
                return linearLayout3;
            case 6:
                zps zpsVar = new zps(xfxVar.b.a);
                zpsVar.n(iu30Var);
                LinearLayout linearLayout4 = zpsVar.a.a;
                linearLayout4.setTag(zpsVar);
                return linearLayout4;
            default:
                bqs bqsVar = new bqs(xfxVar.b.a);
                bqsVar.n(iu30Var);
                LinearLayout linearLayout5 = (LinearLayout) bqsVar.a.b;
                linearLayout5.setTag(bqsVar);
                return linearLayout5;
        }
    }
}
