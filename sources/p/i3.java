package p;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(p811 p811Var, byte b) {
        super(1);
        this.a = b;
        this.b = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                return ((dtw) p811Var.a).w;
            case 1:
                return ((dtw) p811Var.a).w;
            case 2:
                ((Function0) p811Var.a).invoke();
                return rih1Var;
            case 3:
                p811Var.a = new beh(((jy21) obj).b());
                return rih1Var;
            case 4:
                p811Var.a = new ceh();
                return rih1Var;
            case 5:
                p811Var.a = ((vuk) obj).j();
                return rih1Var;
            case 6:
                p811Var.a = ((h720) obj).a;
                return rih1Var;
            case 7:
                return Boolean.valueOf(((bdn0) obj) == p811Var.a);
            case 8:
                Object obj2 = p811Var.a;
                if (obj2 != null) {
                    ((h7k1) obj2).b();
                    return rih1Var;
                }
                u890.C("boundRequest");
                throw null;
            case 9:
                p811Var.a = (RectF) obj;
                return rih1Var;
            case 10:
                ValueAnimator valueAnimator = (ValueAnimator) p811Var.a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return rih1Var;
            case 11:
                ((Function0) p811Var.a).invoke();
                return rih1Var;
            case 12:
                p811Var.a = (y9e1) obj;
                return rih1Var;
            default:
                ((cmh1) p811Var.a).dispose();
                return rih1Var;
        }
    }
}
