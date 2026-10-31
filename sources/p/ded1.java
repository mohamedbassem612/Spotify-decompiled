package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ded1 implements uql1 {
    public final /* synthetic */ eed1 a;

    public ded1(eed1 eed1Var) {
        this.a = eed1Var;
    }

    @Override // p.uql1
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.a.a.j(windowInsets.getInsets(WindowInsets.Type.systemBars()));
        return view.onApplyWindowInsets(windowInsets);
    }
}
