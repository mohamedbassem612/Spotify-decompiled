package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewpager2.widget.ViewPager2;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e4t0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f4t0 b;

    public /* synthetic */ e4t0(f4t0 f4t0Var, byte b) {
        this.a = b;
        this.b = f4t0Var;
    }

    public final void accept(Object obj) {
        ug7 ug7Var;
        fp80 fp80VarB;
        byte b = this.a;
        f4t0 f4t0Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                cbq0 cbq0Var = f4t0Var.c.f;
                if (cbq0Var != null && (ug7Var = cbq0Var.b) != null && num.intValue() == ug7Var.d) {
                    phi0 phi0Var = f4t0Var.a;
                    TextView textView = (TextView) phi0Var.e;
                    textView.setText(ug7Var.a);
                    textView.setContentDescription(ug7Var.f);
                    LinearLayout linearLayout = (LinearLayout) phi0Var.b;
                    long j = ug7Var.b;
                    long j2 = ug7Var.c;
                    kks0 kks0Var = new kks0(f4t0Var, (byte) 6);
                    float dimensionPixelSize = linearLayout.getContext().getResources().getDimensionPixelSize(2131167023);
                    linearLayout.setTranslationX(dimensionPixelSize);
                    linearLayout.setAlpha(0.0f);
                    linearLayout.setVisibility(0);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "translationX", dimensionPixelSize, 0.0f);
                    objectAnimatorOfFloat.setDuration(500L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat2.setDuration(500L);
                    objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f);
                    objectAnimatorOfFloat3.setDuration(250L);
                    objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                    objectAnimatorOfFloat3.setStartDelay(j2);
                    objectAnimatorOfFloat3.addListener(new oqr(linearLayout, kks0Var, (byte) 4));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setStartDelay(j);
                    animatorSet.addListener(new d20(objectAnimatorOfFloat3, (byte) 14));
                    animatorSet.start();
                    f4t0Var.Q0 = true;
                    o0i o0iVar = (o0i) f4t0Var.N0.c.getValue();
                    hp80 hp80Var = o0iVar != null ? o0iVar.e : null;
                    bcl1 bcl1Var = f4t0Var.t;
                    if (hp80Var != null) {
                        bcl1Var.getClass();
                        fp80VarB = hp80Var.b();
                    } else {
                        fp80VarB = null;
                    }
                    p3m0 p3m0VarH = bcl1Var.h(fp80VarB);
                    x6h1 x6h1VarC = p3m0VarH.a.c();
                    x6h1VarC.i.add(new a7h1("watch_feed_component", "associated_feeds_onboarding", (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = p3m0VarH.b.b.c;
                    f4t0Var.R0 = bcl1Var.b.p(k7h1Var.a(), Collections.singleton(c3h1.b));
                    break;
                }
                break;
            case 1:
                boolean z = ((gcl1) obj) instanceof ecl1;
                phi0 phi0Var2 = f4t0Var.a;
                if (!z) {
                    ((ComposeView) phi0Var2.f).setVisibility(8);
                } else {
                    ((ComposeView) phi0Var2.f).setVisibility(f4t0Var.b.size() <= 1 ? 8 : 0);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                int size = f4t0Var.b.size();
                ViewPager2 viewPager2 = (ViewPager2) f4t0Var.a.c;
                if (size <= 1) {
                    viewPager2.setUserInputEnabled(false);
                } else {
                    viewPager2.setUserInputEnabled(bool.booleanValue());
                }
                break;
        }
    }
}
