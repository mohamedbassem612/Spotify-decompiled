package p;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dm30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em30 b;
    public final /* synthetic */ ixg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dm30(em30 em30Var, ixg ixgVar, byte b) {
        super(1);
        this.a = b;
        this.b = em30Var;
        this.c = ixgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ixg ixgVar = this.c;
        em30 em30Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (em30Var.X == ixgVar) {
                    em30Var.X = null;
                    LinearLayout linearLayout = em30Var.e;
                    GradientDrawable gradientDrawableG = rno1.g(em30Var.d, iIntValue);
                    WeakHashMap weakHashMap = b8k1.a;
                    linearLayout.setBackground(gradientDrawableG);
                }
                break;
            default:
                if (em30Var.X == ixgVar) {
                    em30Var.X = null;
                    LinearLayout linearLayout2 = em30Var.e;
                    WeakHashMap weakHashMap2 = b8k1.a;
                    linearLayout2.setBackground(null);
                }
                break;
        }
        return rih1Var;
    }
}
