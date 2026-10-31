package p;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.campaigns.storytelling.controls.stories.StoriesProgressBar;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kb5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lb5) obj).requestLayout();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gch0 gch0Var = ((BottomSheetBehavior) obj).i;
                if (gch0Var != null) {
                    gch0Var.n(fFloatValue);
                }
                break;
            case 2:
                Drawable drawable = ((vdg) obj).f;
                if (drawable != null) {
                    drawable.invalidateSelf();
                }
                break;
            case 3:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                ((rah) obj).b.c(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 5:
                ((qah) obj).a.c(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                ((ujr) obj).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                ((nru) obj).invalidateSelf();
                break;
            case 8:
                ((mzx) ((jav) obj)).c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                int i = EqualizerView.Y0;
                ((EqualizerView) obj).z(true);
                break;
            case 10:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                kl10 kl10Var = (kl10) obj;
                kl10Var.c.setAlpha(iFloatValue);
                kl10Var.d.setAlpha(iFloatValue);
                kl10Var.S0.invalidate();
                break;
            case 11:
                ((cn90) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 12:
                ((xyf0) obj).a.requestLayout();
                break;
            case 13:
                ((mnm0) obj).a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                ((b2p0) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                View view = ((cvq0) obj).b;
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                view.invalidate();
                break;
            case 16:
                ((LottieAnimationView) ((PreviewOverlayView) obj).T0.c).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                SmartShuffleButtonView.a((SmartShuffleButtonView) obj).invalidateSelf();
                break;
            case 18:
                r2a1 r2a1Var = (r2a1) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                StoriesProgressBar storiesProgressBar = ((g4c1) r2a1Var.b).U0;
                storiesProgressBar.currentStory = ((o7c1) r2a1Var.c).a;
                storiesProgressBar.currentStoryProgress = animatedFraction;
                storiesProgressBar.invalidate();
                break;
            case 19:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 20:
                ((TextInputLayout) obj).h2.n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
                gdl1 gdl1Var = (gdl1) obj;
                RectF[] rectFArr = gdl1Var.b;
                RectF[] rectFArr2 = gdl1Var.e;
                lr80 it = new tr80(0, rectFArr2.length - 1, 1).iterator();
                while (((sr80) it).c) {
                    int iNextInt = it.nextInt();
                    RectF[] rectFArr3 = gdl1Var.c;
                    float f = rectFArr[iNextInt].top;
                    rectFArr3[iNextInt].top = Math.min((gdl1Var.getHeight() / 2.0f) - gdl1Var.getMinRectHeight(), f - ((f - rectFArr2[iNextInt].top) * fFloatValue2));
                    float f2 = rectFArr2[iNextInt].bottom;
                    float f3 = rectFArr[iNextInt].bottom;
                    rectFArr3[iNextInt].bottom = Math.max((gdl1Var.getHeight() / 2.0f) + gdl1Var.getMinRectHeight(), l1d.e(f2, f3, fFloatValue2, f3));
                    RectF rectF = rectFArr3[iNextInt];
                    RectF rectF2 = rectFArr2[iNextInt];
                    rectF.left = rectF2.left;
                    rectF.right = rectF2.right;
                }
                gdl1Var.postInvalidateOnAnimation();
                break;
        }
    }
}
