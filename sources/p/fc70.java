package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fc70 implements q570 {
    public final View b(ViewGroup viewGroup, l670 l670Var) {
        Button button;
        Context context = viewGroup.getContext();
        if (xoi1.a(viewGroup.getContext())) {
            Context context2 = viewGroup.getContext();
            j4b1 j4b1Var = j4b1.L4;
            button = (Button) yoi1.w(context2, Button.class, 2130969943);
            k4k.o(button, "", j4b1Var);
            button.setOnClickListener(null);
        } else {
            button = (Button) yoi1.w(viewGroup.getContext(), Button.class, 2130970262);
        }
        button.addOnAttachStateChangeListener(new c9s(context, new pn20(button, (byte) 1), (byte) 6));
        return button;
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.h);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Button button = (Button) view;
        String str = ((dd70) y570Var.k()).a.f;
        j4b1 j4b1Var = !TextUtils.isEmpty(str) ? (j4b1) gc70.a.o(str).h() : null;
        String str2 = ((id70) y570Var.n()).a.a;
        if (xoi1.a(button.getContext())) {
            k4k.o(button, str2, j4b1Var);
        } else {
            Context context = button.getContext();
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            z0o1.u(context, button, j4b1Var, str2);
        }
        two1.r(l670Var, button, y570Var);
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        if (iArr.length <= 0) {
            return;
        }
        hhg1.h("Component does not support scrolling");
    }
}
