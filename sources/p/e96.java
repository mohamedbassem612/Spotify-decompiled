package p;

import android.app.Activity;
import android.os.Build;
import android.os.HandlerThread;
import android.view.Choreographer;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e96 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public e96(iac0 iac0Var, iuf1 iuf1Var, abu0 abu0Var, zau0 zau0Var, ven0 ven0Var) {
        this.a = (byte) 4;
        this.b = iac0Var;
        this.d = iuf1Var;
        this.e = abu0Var;
        this.f = zau0Var;
        this.c = ven0Var;
    }

    public final void dispose() {
        trl trlVar;
        switch (this.a) {
            case 0:
                l96 l96Var = (l96) this.b;
                ven0 ven0Var = (ven0) this.e;
                if (!((Boolean) ((ven0) this.c).getValue()).booleanValue() && !((Boolean) ((ven0) this.d).getValue()).booleanValue()) {
                    l96Var.e.e(((psk) ven0Var.getValue()) == psk.b ? String.valueOf(((String) ((ven0) this.f).getValue()).length()) : "");
                    l96Var.g.a((psk) ven0Var.getValue());
                    break;
                }
                break;
            case 1:
                ((dk30) this.b).a("WrappedStory · dispose", (uqt) this.c);
                dh30 dh30Var = (dh30) this.d;
                ((Activity) this.e).getWindow().removeOnFrameMetricsAvailableListener((yj30) dh30Var.b);
                ((HandlerThread) dh30Var.c).quitSafely();
                if (Build.VERSION.SDK_INT >= 29 && (trlVar = (trl) this.f) != null) {
                    trlVar.g();
                }
                Choreographer.FrameCallback frameCallback = (dk30) this.b;
                if (((dk30) frameCallback).d) {
                    ((dk30) frameCallback).d = false;
                    ((dk30) frameCallback).a.removeFrameCallback(frameCallback);
                }
                tgp1.d = null;
                break;
            case 2:
                ((x8c0) this.b).d((ek2) this.c);
                ((View) this.d).removeOnAttachStateChangeListener((wus) this.e);
                ((bsc0) this.f).invoke();
                break;
            case 3:
                ((l811) this.b).a = true;
                ((iac0) this.c).getLifecycle().d((mo71) this.d);
                uoa uoaVar = (uoa) this.e;
                uoaVar.u();
                ((woa) this.f).c(uoaVar);
                break;
            default:
                ((iac0) this.b).getLifecycle().d((iuf1) this.d);
                ven0 ven0Var2 = (ven0) this.c;
                r091 r091Var = (r091) ven0Var2.getValue();
                if (r091Var != null) {
                    r091Var.d();
                }
                r091 r091Var2 = (r091) ven0Var2.getValue();
                if (r091Var2 != null) {
                    r091Var2.j();
                }
                ((abu0) this.e).b((zau0) this.f);
                break;
        }
    }

    public /* synthetic */ e96(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
