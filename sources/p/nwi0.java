package p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nwi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwi0(hjc hjcVar, wpw wpwVar, byte b) {
        super(1);
        this.a = b;
        this.b = hjcVar;
    }

    public final Object invoke(Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        byte b = this.a;
        hjc hjcVar = this.b;
        switch (b) {
            case 0:
                h98 h98Var = new h98(hjcVar.b.a, (byte) 11);
                ConstraintLayout constraintLayout = (ConstraintLayout) ((w6e0) h98Var.b).d;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int dimension = (int) constraintLayout.getResources().getDimension(2131167023);
                    marginLayoutParams.setMarginEnd(dimension);
                    marginLayoutParams.setMarginStart(dimension);
                    marginLayoutParams.bottomMargin = dimension;
                    marginLayoutParams.topMargin = dimension;
                }
                return h98Var;
            default:
                h98 h98Var2 = new h98(hjcVar.b.a, (byte) 11);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ((w6e0) h98Var2.b).d;
                ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    int dimension2 = (int) constraintLayout2.getResources().getDimension(2131167023);
                    marginLayoutParams.setMarginEnd(dimension2);
                    marginLayoutParams.setMarginStart(dimension2);
                    marginLayoutParams.bottomMargin = dimension2;
                    marginLayoutParams.topMargin = dimension2;
                }
                return h98Var2;
        }
    }
}
