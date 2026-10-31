package p;

import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j7d1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k7d1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j7d1(k7d1 k7d1Var, byte b) {
        super(0);
        this.a = b;
        this.b = k7d1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        k7d1 k7d1Var = this.b;
        switch (b) {
            case 0:
                ConstraintLayout constraintLayout = k7d1Var.Y0;
                View composeView = new ComposeView(constraintLayout.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setId(View.generateViewId());
                composeView.setContent(new j2i(1449183412, new i7d1(k7d1Var, (byte) 2), true));
                qhl qhlVar = new qhl(-2, -2);
                qhlVar.i = 0;
                qhlVar.t = 0;
                qhlVar.v = 0;
                constraintLayout.addView(composeView, qhlVar);
                return composeView;
            default:
                return new syd(k7d1Var.Z0, (ComposeView) k7d1Var.e1.getValue());
        }
    }
}
