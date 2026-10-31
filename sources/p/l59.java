package p;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l59 implements f4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public l59(gs71 gs71Var, f4h1 f4h1Var, tr71 tr71Var) {
        this.a = (byte) 2;
        this.c = f4h1Var;
        this.b = gs71Var.e((View) f4h1Var.getView(), tr71Var);
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (ConstraintLayout) ((s59) obj).c;
            case 1:
                return (LinearLayout) obj;
            case 2:
                return (FrameLayout) obj;
            case 3:
                return (ConstraintLayout) ((s59) obj).c;
            case 4:
                return (View) obj;
            case 5:
                return (LinearLayout) obj;
            default:
                return (FrameLayout) obj;
        }
    }

    public final Bundle serialize() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new Bundle();
            case 1:
                return mno1.g();
            case 2:
                return ((f4h1) obj).serialize();
            case 3:
                return new Bundle();
            case 4:
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_animation_completed", ((byg0) obj).o);
                return bundle;
            case 5:
                return Bundle.EMPTY;
            default:
                return mno1.g();
        }
    }

    public final void start() {
        h72 h72Var;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((m59) obj).start();
                break;
            case 1:
                ((g8e) obj).start();
                break;
            case 2:
                ((f4h1) obj).start();
                break;
            case 3:
                ((lkg0) obj).start();
                break;
            case 4:
                byg0 byg0Var = (byg0) obj;
                if (!byg0Var.o && (h72Var = byg0Var.n) != null) {
                    h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.b, (ObjectAnimator) h72Var.d, (ObjectAnimator) h72Var.h, (ObjectAnimator) h72Var.f, (ObjectAnimator) h72Var.t}), new d20(byg0Var, (byte) 9), hlv.b, 350L);
                    break;
                }
                break;
            case 5:
                ((l5r0) obj).start();
                break;
            default:
                ((l3v0) obj).a();
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((m59) obj).stop();
                break;
            case 1:
                ((g8e) obj).stop();
                break;
            case 2:
                ((f4h1) obj).stop();
                break;
            case 3:
                ((lkg0) obj).stop();
                break;
            case 4:
                h72 h72Var = ((byg0) obj).n;
                if (h72Var != null) {
                    h72Var.p();
                }
                break;
            case 5:
                ((l5r0) obj).stop();
                break;
            default:
                ((l3v0) obj).b();
                break;
        }
    }

    public /* synthetic */ l59(View view, Object obj, byte b) {
        this.a = b;
        this.b = view;
        this.c = obj;
    }

    public l59(cir0 cir0Var, s59 s59Var, m59 m59Var) {
        this.a = (byte) 0;
        this.b = s59Var;
        this.c = m59Var;
        cir0Var.j(new pd8(this, (byte) 1));
    }

    public l59(cir0 cir0Var, s59 s59Var, lkg0 lkg0Var) {
        this.a = (byte) 3;
        this.b = s59Var;
        this.c = lkg0Var;
        cir0Var.j(new pd8(this, (byte) 9));
    }
}
