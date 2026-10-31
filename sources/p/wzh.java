package p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class wzh implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wzh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        Window window;
        View viewPeekDecorView;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g0i g0iVar = (g0i) obj;
                if (k8c0Var == k8c0.ON_STOP && (window = g0iVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                g0i g0iVar2 = (g0i) obj;
                if (k8c0Var == k8c0.ON_DESTROY) {
                    g0iVar2.b.d();
                    if (!g0iVar2.isChangingConfigurations()) {
                        g0iVar2.o().a();
                    }
                    b0i b0iVar = g0iVar2.f;
                    g0i g0iVar3 = b0iVar.d;
                    g0iVar3.getWindow().getDecorView().removeCallbacks(b0iVar);
                    g0iVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(b0iVar);
                }
                break;
            default:
                pe41 pe41Var = (pe41) obj;
                if (k8c0Var == k8c0.ON_START) {
                    pe41Var.h = true;
                } else if (k8c0Var == k8c0.ON_STOP) {
                    pe41Var.h = false;
                }
                break;
        }
    }
}
