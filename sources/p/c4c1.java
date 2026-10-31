package p;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.spotify.campaigns.storytelling.controls.stories.StoriesProgressBar;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c4c1 {
    public final ie90 a;
    public final tbc1 b;
    public final g4c1 c;
    public final w3c1 d;
    public final g4c1 e;
    public final w3c1 f;

    public c4c1(Activity activity, ie90 ie90Var, tbc1 tbc1Var) {
        this.a = ie90Var;
        this.b = tbc1Var;
        g4c1 g4c1Var = new g4c1(activity, ie90Var);
        this.c = g4c1Var;
        w3c1 w3c1Var = new w3c1(activity);
        this.d = w3c1Var;
        this.e = g4c1Var;
        this.f = w3c1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, java.lang.Object, p.g4c1] */
    public final void a(l5c1 l5c1Var) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        CompletableAndThenCompletable completableAndThenCompletable;
        ?? r0 = this.c;
        View view = r0.Y0;
        View view2 = r0.X0;
        View view3 = r0.W0;
        View view4 = r0.V0;
        StoriesProgressBar storiesProgressBar = r0.U0;
        View view5 = r0.d1;
        View view6 = r0.a1;
        vhd vhdVar = r0.n1;
        if (l5c1Var instanceof a5c1) {
            storiesProgressBar.setStoriesCount(((a5c1) l5c1Var).a);
            return;
        }
        if (l5c1Var instanceof i5c1) {
            int i = ((i5c1) l5c1Var).a;
            vhdVar.b();
            storiesProgressBar.b = i;
            storiesProgressBar.c = 0.0f;
            storiesProgressBar.invalidate();
            view6.setEnabled(false);
            return;
        }
        if (!(l5c1Var instanceof k5c1)) {
            if (l5c1Var.equals(e5c1.a)) {
                view4.setVisibility(8);
                view3.setVisibility(0);
                ValueAnimator valueAnimator3 = (ValueAnimator) vhdVar.d;
                if (valueAnimator3 != null) {
                    valueAnimator3.pause();
                }
                vhdVar.b = true;
                return;
            }
            if (l5c1Var.equals(h5c1.a)) {
                view4.setVisibility(0);
                view3.setVisibility(8);
                if (!vhdVar.c && (valueAnimator2 = (ValueAnimator) vhdVar.d) != null) {
                    valueAnimator2.resume();
                }
                vhdVar.b = false;
                return;
            }
            if (l5c1Var.equals(b5c1.a)) {
                view2.setVisibility(4);
                view2.setClickable(false);
                view.setVisibility(0);
                view.setClickable(true);
                return;
            }
            if (l5c1Var.equals(c5c1.a)) {
                view2.setVisibility(0);
                view2.setClickable(true);
                view.setVisibility(4);
                view.setClickable(false);
                return;
            }
            if (l5c1Var.equals(j5c1.a)) {
                view5.setVisibility(0);
                view6.setVisibility(0);
                view6.setEnabled(true);
                return;
            }
            if (l5c1Var.equals(d5c1.a)) {
                view5.setVisibility(8);
                view6.setVisibility(8);
                return;
            }
            if (l5c1Var.equals(f5c1.a)) {
                ValueAnimator valueAnimator4 = (ValueAnimator) vhdVar.d;
                if (valueAnimator4 != null) {
                    valueAnimator4.pause();
                }
                vhdVar.c = true;
                return;
            }
            if (!l5c1Var.equals(g5c1.a)) {
                eg.o();
                return;
            }
            if (!vhdVar.b && (valueAnimator = (ValueAnimator) vhdVar.d) != null) {
                valueAnimator.resume();
            }
            vhdVar.c = false;
            return;
        }
        o7c1 o7c1Var = ((k5c1) l5c1Var).a;
        Context context = r0.getContext();
        int i2 = o7c1Var.a;
        String strValueOf = String.valueOf(i2 + 1);
        String strValueOf2 = String.valueOf(storiesProgressBar.getStoriesCount());
        String str = o7c1Var.c;
        storiesProgressBar.setContentDescription(context.getString(2131962941, strValueOf, strValueOf2, str));
        view6.setContentDescription(r0.getContext().getString(2131962942, str));
        Disposable disposable = r0.o1;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposableSubscribe = null;
        r0.o1 = null;
        ie90 ie90Var = r0.T0;
        if (ie90Var != null) {
            String str2 = (String) storiesProgressBar.getContentDescription();
            if (((pe) ie90Var.e).e()) {
                completableAndThenCompletable = new CompletableAndThenCompletable(Completable.u(500L, TimeUnit.MILLISECONDS, Schedulers.c), new urn0(ie90Var, str2, (byte) 2));
            } else {
                completableAndThenCompletable = CompletableEmpty.a;
                completableAndThenCompletable.getClass();
            }
            disposableSubscribe = completableAndThenCompletable.subscribe();
        }
        r0.o1 = disposableSubscribe;
        vhdVar.b();
        oho1 oho1Var = o7c1Var.b;
        if (oho1Var instanceof x6c1) {
            storiesProgressBar.b = i2;
            storiesProgressBar.c = 1.0f;
            storiesProgressBar.invalidate();
        } else {
            if (!(oho1Var instanceof w6c1)) {
                eg.o();
                return;
            }
            w6c1 w6c1Var = (w6c1) oho1Var;
            long millis = w6c1Var.d.toMillis(w6c1Var.c);
            r2a1 r2a1Var = new r2a1((Object) r0, o7c1Var, (byte) 16);
            esa1 esa1Var = new esa1((Object) r0, o7c1Var, (byte) 10);
            vhdVar.b();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(millis);
            l811 l811Var = new l811();
            valueAnimatorOfFloat.addUpdateListener(new kb5(r2a1Var, (byte) 18));
            valueAnimatorOfFloat.addListener(new eyy(l811Var, esa1Var, l811Var, (byte) 1));
            valueAnimatorOfFloat.start();
            vhdVar.d = valueAnimatorOfFloat;
        }
        iy61 iy61Var = o7c1Var.d;
        if (u890.j(iy61Var, hy61.a)) {
            view5.setVisibility(0);
            view6.setVisibility(0);
            view6.setEnabled(true);
        } else if (!u890.j(iy61Var, gy61.a)) {
            eg.o();
        } else {
            view5.setVisibility(8);
            view6.setVisibility(8);
        }
    }
}
