package p;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b4u extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        sbk1 sbk1Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                if (!(view instanceof sbk1) || (outline2 = (sbk1Var = (sbk1) view).e) == null) {
                    return;
                }
                outline.set(outline2);
                float f = sbk1Var.N0;
                if (f == 0.0f && sbk1Var.O0 == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) sbk1Var.O0);
                return;
            default:
                throw new ClassCastException();
        }
    }
}
