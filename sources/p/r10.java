package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r10 implements sh, k1q0 {
    public final /* synthetic */ View a;

    public boolean r(View view) {
        return this.a.callOnClick();
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(view);
        nk80 nk80VarI = hsl1VarA != null ? hsl1VarA.a.i(647) : null;
        if (nk80VarI != null) {
            int i = nk80VarI.c;
            View view2 = this.a;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i2 = marginLayoutParams.leftMargin;
                int i3 = -nk80VarI.a;
                if (i2 != i3 || marginLayoutParams.rightMargin != (-i)) {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = -i;
                    view2.setLayoutParams(marginLayoutParams);
                }
            }
        }
        return hsl1Var;
    }
}
