package p;

import com.spotify.mainlayout.ui.view.MainLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k1g0 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l1g0 b;

    public /* synthetic */ k1g0(l1g0 l1g0Var, byte b) {
        this.a = b;
        this.b = l1g0Var;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.spotify.mainlayout.ui.view.MainLayout] */
    public final void b(Object obj) {
        byte b = this.a;
        l1g0 l1g0Var = this.b;
        switch (b) {
            case 0:
                uwq0 uwq0Var = (uwq0) obj;
                MainLayout mainLayout = l1g0Var.w;
                if (mainLayout != null) {
                    mainLayout.setOverlayTouchPassthroughActive((uwq0Var != null ? uwq0Var.a : null) != null);
                    mainLayout.setOverlayTouchDispatcher(uwq0Var != null ? uwq0Var.a : null);
                }
                break;
            case 1:
                hgr0 hgr0Var = (hgr0) obj;
                MainLayout mainLayout2 = l1g0Var.w;
                if (mainLayout2 != null) {
                    mainLayout2.setPageSurroundingsProperty(hgr0Var);
                }
                break;
            default:
                f6w0 f6w0Var = (f6w0) obj;
                ?? r4 = l1g0Var.w;
                if (r4 != 0) {
                    e6w0 e6w0Var = f6w0Var != null ? f6w0Var.a : null;
                    d1g0 d1g0Var = r4.G1;
                    d1g0Var.d.c(d1g0.i[1], d1g0Var, e6w0Var);
                    WeakHashMap weakHashMap = b8k1.a;
                    r4.requestApplyInsets();
                }
                break;
        }
    }
}
