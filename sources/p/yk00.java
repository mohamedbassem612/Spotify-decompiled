package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.home.evopage.mobius.State;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yk00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk00(el00 el00Var, byte b) {
        super(0);
        this.a = b;
        this.b = el00Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    public final Object invoke() {
        nk80 nk80VarI;
        int i = 0;
        switch (this.a) {
            case 0:
                this.b.g.p(kq60.O0);
                el00 el00Var = this.b;
                if (!el00Var.P0 || el00Var.X0 != null) {
                    el00Var.g.m(1, el00Var.b);
                    wo60 wo60Var = this.b.c.h;
                    synchronized (wo60Var) {
                        wo60Var.c(1, false);
                    }
                }
                return rih1.a;
            case 1:
                el00 el00Var2 = this.b;
                Rect rect = new Rect();
                el00Var2.T0.getGlobalVisibleRect(rect);
                hsl1 hsl1Var = el00Var2.V0;
                if (hsl1Var != null && (nk80VarI = hsl1Var.a.i(519)) != null) {
                    i = nk80VarI.d;
                }
                float f = rect.left;
                float f2 = rect.top;
                float f3 = rect.right;
                float f4 = rect.bottom;
                return m511.a(new m511(f, f2, f3, f4), 0.0f, f4 - i, 7);
            default:
                el00 el00Var3 = this.b;
                View view = el00Var3.a;
                if (!el00Var3.Y0) {
                    ie11 ie11Var = el00Var3.Z;
                    if ((ie11Var.d || !ie11Var.c.k()) ? false : !ie11Var.a.b(ie11Var.b, el00Var3.N0).h(je11.a, false)) {
                        el00Var3.Y0 = true;
                        ImageView imageView = (ImageView) view.findViewById(2131430558);
                        Drawable drawable = imageView.getDrawable();
                        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
                        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(2131429246) : null;
                        if (drawableFindDrawableByLayerId != null) {
                            drawableFindDrawableByLayerId.setTint(view.getResources().getColor(2131103942));
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationY", -300.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(500L);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(1000L);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, -300.0f);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.1f);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.1f);
                        objectAnimatorOfFloat2.setDuration(500L);
                        objectAnimatorOfFloat3.setDuration(300L);
                        objectAnimatorOfFloat4.setDuration(300L);
                        AnimatorSet animatorSet = new AnimatorSet();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                        animatorSet.playSequentially(objectAnimatorOfFloat, valueAnimatorOfFloat, animatorSet2);
                        animatorSet.start();
                        animatorSet.setStartDelay(1000L);
                        animatorSet.addListener(new d20(el00Var3, (byte) 5));
                    }
                }
                el00Var3.Q0.m((Object) null, Boolean.TRUE);
                if (el00Var3.P0) {
                    State state = (State) el00Var3.c.Q0.e();
                    qe91 qe91Var = (qe91) el00Var3.R0.f.getValue();
                    if (qe91Var == null || !qe91Var.c()) {
                        State.Content content = state instanceof State.Content ? (State.Content) state : null;
                        if (content != null && !content.isOnline() && !content.getModel().e.isEmpty()) {
                            el00Var3.g.m(1, el00Var3.b);
                        }
                    } else {
                        el00Var3.g.m(1, el00Var3.b);
                    }
                }
                return rih1.a;
        }
    }
}
