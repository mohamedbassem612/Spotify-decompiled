package p;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rql1 extends rek1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tql1 b;

    public /* synthetic */ rql1(tql1 tql1Var, byte b) {
        this.a = b;
        this.b = tql1Var;
    }

    public final void d(View view) {
        View view2;
        byte b = this.a;
        tql1 tql1Var = this.b;
        switch (b) {
            case 0:
                if (tql1Var.q && (view2 = tql1Var.i) != null) {
                    view2.setTranslationY(0.0f);
                    tql1Var.f.setTranslationY(0.0f);
                }
                tql1Var.f.setVisibility(8);
                tql1Var.f.setTransitioning(false);
                tql1Var.v = null;
                em3 em3Var = tql1Var.m;
                if (em3Var != null) {
                    em3Var.x(tql1Var.l);
                    tql1Var.l = null;
                    tql1Var.m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = tql1Var.e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = b8k1.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                tql1Var.v = null;
                tql1Var.f.requestLayout();
                break;
        }
    }
}
