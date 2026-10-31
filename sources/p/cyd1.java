package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cyd1 extends emc0 {
    public final void n(int i, w611 w611Var) {
        fyd1 fyd1Var = (fyd1) A(i);
        ym ymVar = new ym(this, i, (byte) 25);
        ua91 ua91Var = ((xqi1) w611Var).U0;
        Context context = ((ConstraintLayout) ua91Var.b).getContext();
        ((TextView) ua91Var.e).setText(context.getString(fyd1Var.a));
        ((TextView) ua91Var.d).setText(context.getString(fyd1Var.b));
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ua91Var.c;
        appCompatCheckBox.setChecked(fyd1Var.c);
        appCompatCheckBox.setOnCheckedChangeListener(new u3g(ymVar, (byte) 2));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131626230, viewGroup, false);
        int i2 = 2131431222;
        AppCompatCheckBox appCompatCheckBoxT = m5n1.t(constraintLayoutL, 2131431222);
        if (appCompatCheckBoxT != null) {
            i2 = 2131431223;
            TextView textView = (TextView) m5n1.t(constraintLayoutL, 2131431223);
            if (textView != null) {
                ConstraintLayout constraintLayout = constraintLayoutL;
                i2 = 2131431225;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutL, 2131431225);
                if (textView2 != null) {
                    return new xqi1(new ua91(constraintLayout, appCompatCheckBoxT, textView, textView2, (byte) 28));
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i2)));
        return null;
    }
}
