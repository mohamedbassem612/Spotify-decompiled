package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.spotify.thestage.vtec.datasource.TheStageRestrictedException;
import com.spotify.thestage.vtec.datasource.TheStageRestrictedGenericException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fe8 implements f4h1 {
    public final /* synthetic */ byte a = 0;
    public final View b;

    public fe8(View view, elb1 elb1Var, Context context, lzn0 lzn0Var) {
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        AnimatorSet animatorSet;
        this.b = view;
        k2l1 k2l1Var = elb1Var.a;
        if (k2l1Var instanceof TheStageRestrictedGenericException) {
            mmr0Var2 = new mmr0(context.getString(2131963830), context.getString(2131963829));
        } else {
            if (k2l1Var instanceof TheStageRestrictedException) {
                String string = context.getString(2131963830);
                String str = ((TheStageRestrictedException) k2l1Var).a;
                mmr0Var = new mmr0(string, str == null ? context.getString(2131963829) : str);
            } else {
                String string2 = context.getString(2131963827);
                String a = k2l1Var.getA();
                mmr0Var = new mmr0(string2, a == null ? context.getString(2131963826) : a);
            }
            mmr0Var2 = mmr0Var;
        }
        String str2 = (String) mmr0Var2.a;
        String str3 = (String) mmr0Var2.b;
        b8k1.n(view, 2131428102).setOnClickListener(new uva0(lzn0Var, (byte) 2));
        View viewInflate = ((ViewStub) view.findViewById(2131431392)).inflate();
        zsc zscVar = new zsc(viewInflate);
        ((TextView) zscVar.c).setText(str2);
        ((TextView) zscVar.d).setText(str3);
        AnimatorSet animatorSet2 = (AnimatorSet) zscVar.e;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
        if (viewInflate.getVisibility() == 0) {
            animatorSet = null;
        } else {
            viewInflate.setTranslationY(viewInflate.getHeight());
            viewInflate.setAlpha(0.0f);
            viewInflate.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewInflate, (Property<View, Float>) View.TRANSLATION_Y, a8o.x(8.0f, viewInflate.getResources()), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewInflate, (Property<View, Float>) View.ALPHA, 1.0f);
            PathInterpolator pathInterpolator = hlv.f;
            objectAnimatorOfFloat.setInterpolator(pathInterpolator);
            objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet3.setDuration(300L);
            animatorSet3.start();
            animatorSet = animatorSet3;
        }
        zscVar.e = animatorSet;
    }

    public final Object getView() {
        byte b = this.a;
        return this.b;
    }

    public final void start() {
        byte b = this.a;
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public fe8(Context context, ViewGroup viewGroup, ge8 ge8Var, f78 f78Var) {
        tka0 tka0Var = dtw.C;
        this.b = mhc.b(context, viewGroup, (rt01) ge8Var.b, f78Var, (ipb1) null, 112).w;
    }
}
