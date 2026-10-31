package p;

import com.spotify.nowplaying.uiusecases.overlay.OverlayHidingFrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class knj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ knj1(pnj1 pnj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = pnj1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pnj1 pnj1Var = this.b;
        switch (b) {
            case 0:
                return (wpw) pnj1Var.i1.get();
            case 1:
                return ((k691) pnj1Var.o1.get()).a(voo1.r(pnj1Var.a));
            case 2:
                return new jpg0((laa) pnj1Var.j1.get(), jmj1.Q0);
            case 3:
                ioj1 ioj1Var = pnj1Var.x2;
                if (ioj1Var != null) {
                    ioj1Var.u.a(qnj1.c);
                    return rih1Var;
                }
                u890.C("pageStateController");
                throw null;
            case 4:
                ioj1 ioj1Var2 = pnj1Var.x2;
                if (ioj1Var2 == null) {
                    u890.C("pageStateController");
                    throw null;
                }
                if (ioj1Var2.f34p) {
                    ioj1Var2.u.a(rnj1.c);
                }
                return rih1Var;
            case 5:
                OverlayHidingFrameLayout overlayHidingFrameLayout = pnj1Var.T1;
                if (overlayHidingFrameLayout == null) {
                    u890.C("overlayControlsView");
                    throw null;
                }
                if (overlayHidingFrameLayout.e()) {
                    pnj1Var.v2 = true;
                }
                OverlayHidingFrameLayout overlayHidingFrameLayout2 = pnj1Var.T1;
                if (overlayHidingFrameLayout2 != null) {
                    overlayHidingFrameLayout2.a(false);
                    return rih1Var;
                }
                u890.C("overlayControlsView");
                throw null;
            case 6:
                if (pnj1Var.v2) {
                    OverlayHidingFrameLayout overlayHidingFrameLayout3 = pnj1Var.T1;
                    if (overlayHidingFrameLayout3 == null) {
                        u890.C("overlayControlsView");
                        throw null;
                    }
                    overlayHidingFrameLayout3.c(false);
                }
                pnj1Var.v2 = false;
                return rih1Var;
            default:
                ioj1 ioj1Var3 = pnj1Var.x2;
                if (ioj1Var3 != null) {
                    ioj1Var3.u.a(unj1.c);
                    return rih1Var;
                }
                u890.C("pageStateController");
                throw null;
        }
    }
}
