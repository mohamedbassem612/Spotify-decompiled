package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class s7k1 {
    public static hsl1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        hsl1 hsl1VarG = hsl1.g(null, rootWindowInsets);
        esl1 esl1Var = hsl1VarG.a;
        esl1Var.y(hsl1VarG);
        View rootView = view.getRootView();
        esl1Var.d(rootView);
        esl1Var.p(rootView);
        esl1Var.q();
        return hsl1VarG;
    }
}
