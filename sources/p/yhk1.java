package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yhk1 extends FrameLayout {
    public iac0 a;
    public air0 b;
    public WeakReference c;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && (!(view instanceof yhk1) || ((yhk1) view).c == null)) {
            iac0 iac0Var = this.a;
            if (iac0Var != null) {
                x9p1.p(view, iac0Var);
            }
            air0 air0Var = this.b;
            if (air0Var != null) {
                hm5.J(view, air0Var);
            }
            WeakReference weakReference = this.c;
            if (weakReference != null) {
                hap1.s(view, weakReference);
            }
        }
        super.addView(view, i, layoutParams);
    }
}
