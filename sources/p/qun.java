package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qun extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ avn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qun(avn avnVar, byte b) {
        super(0);
        this.a = b;
        this.b = avnVar;
    }

    public final Object invoke() {
        byte b = this.a;
        avn avnVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(avnVar.a.getResources().getDimensionPixelSize(avnVar.Q0 ? 2131166124 : 2131166123));
            default:
                View view = avnVar.V0;
                int measuredHeight = 0;
                if (avnVar.c != null) {
                    View viewFindViewById = view.findViewById(2131428881);
                    ViewGroup.LayoutParams layoutParams = view.findViewById(2131428372).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                    viewFindViewById.getClass();
                    int measuredHeight2 = viewFindViewById.getMeasuredHeight() * (-1);
                    if (measuredHeight2 == 0) {
                        viewFindViewById.measure(0, 0);
                        measuredHeight2 = viewFindViewById.getMeasuredHeight() * (-1);
                    }
                    otn otnVar = avnVar.R0;
                    if ((otnVar instanceof ltn) || (otnVar instanceof ntn) || (otnVar instanceof mtn)) {
                        measuredHeight = (-i) - (((Toolbar) avnVar.U0.X).getMeasuredHeight() / 2);
                    } else if (measuredHeight2 < 0) {
                        measuredHeight = -i;
                    }
                    measuredHeight += measuredHeight2;
                }
                return Integer.valueOf(measuredHeight);
        }
    }
}
