package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qn20 implements q570, o570 {
    public final int a() {
        return 2131428908;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        Context context = viewGroup.getContext();
        Button button = (Button) yoi1.w(context, Button.class, 2130970262);
        button.addOnAttachStateChangeListener(new c9s(context, new pn20(button, (byte) 0), (byte) 5));
        return button;
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.h);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Button button = (Button) view;
        String str = ((dd70) y570Var.k()).a.f;
        j4b1 j4b1Var = (str == null || str.length() <= 0) ? null : (j4b1) gc70.a.G(str).h();
        String str2 = ((id70) y570Var.n()).a.a;
        if (str2 == null) {
            str2 = "";
        }
        z0o1.u(button.getContext(), button, j4b1Var, str2);
        two1.r(l670Var, button, y570Var);
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        if (iArr.length <= 0) {
            return;
        }
        hhg1.h("Component does not support scrolling");
    }
}
