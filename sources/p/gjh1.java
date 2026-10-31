package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gjh1 implements o570 {
    public final kly0 a;
    public final idd1 b = new idd1(new dch1(this, (byte) 7));
    public final int c = 2131428974;

    public gjh1(kly0 kly0Var) {
        this.a = kly0Var;
    }

    public final int a() {
        return this.c;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        View view = ((qzh) this.b.getValue()).getView();
        view.setPadding(view.getPaddingLeft(), view.getContext().getResources().getDimensionPixelOffset(2131167026), view.getPaddingRight(), view.getPaddingBottom());
        return view;
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str = y570Var.n().a.a;
        if (str == null) {
            str = "";
        }
        r740 r740Var = new r740(str, false);
        idd1 idd1Var = this.b;
        ((qzh) idd1Var.getValue()).f(r740Var);
        ((qzh) idd1Var.getValue()).n(new jy(l670Var, y570Var, (byte) 17));
    }

    public final void e(View view, y570 y570Var, int... iArr) {
    }
}
