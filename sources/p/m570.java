package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class m570 implements n570 {
    public final View b(ViewGroup viewGroup, l670 l670Var) {
        l570 l570VarF = f(viewGroup, l670Var);
        View view = l570VarF.a;
        view.setTag(2131429147, l570VarF);
        return view;
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Object tag = view.getTag(2131429147);
        tag.getClass();
        ((l570) tag).a(y570Var, l670Var, yfuVar);
    }

    public void e(View view, y570 y570Var, int... iArr) {
        Object tag = view.getTag(2131429147);
        tag.getClass();
        ((l570) tag).b(iArr);
    }

    public l570 f(ViewGroup viewGroup, l670 l670Var) {
        View viewL = eqq.l(viewGroup, 2131625081, viewGroup, false);
        viewL.getClass();
        return new wh10(viewL);
    }
}
