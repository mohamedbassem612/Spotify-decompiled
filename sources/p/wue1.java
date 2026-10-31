package p;

import android.content.Context;
import android.util.TypedValue;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wue1 extends w611 {
    public final p410 U0;
    public final int V0;
    public final int W0;

    /* JADX WARN: Illegal instructions before constructor call */
    public wue1(p410 p410Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) p410Var.b;
        super(constraintLayout);
        this.U0 = p410Var;
        Context context = constraintLayout.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130970418, typedValue, true);
        this.V0 = typedValue.data;
        Context context2 = constraintLayout.getContext();
        TypedValue typedValue2 = new TypedValue();
        context2.getTheme().resolveAttribute(2130970440, typedValue2, true);
        this.W0 = typedValue2.data;
    }
}
