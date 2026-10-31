package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ouz0 implements View.OnApplyWindowInsetsListener {
    public static final ouz0 b = new ouz0(0);
    public static final ouz0 c = new ouz0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ ouz0(byte b2) {
        this.a = b2;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z = false;
        switch (this.a) {
            case 0:
                nk80 nk80VarI = hsl1.g((View) null, windowInsets).a.i(519);
                view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
                return windowInsets;
            case 1:
                nk80 nk80VarI2 = hsl1.g((View) null, windowInsets).a.i(519);
                view.setPadding(0, nk80VarI2.b, 0, nk80VarI2.d);
                return windowInsets;
            default:
                m8v m8vVar = (m8v) view;
                boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
                m8vVar.Z0 = windowInsets;
                m8vVar.a1 = z2;
                if (!z2 && m8vVar.getBackground() == null) {
                    z = true;
                }
                m8vVar.setWillNotDraw(z);
                m8vVar.requestLayout();
                return windowInsets.consumeSystemWindowInsets();
        }
    }
}
