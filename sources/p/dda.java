package p;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kda b;

    public /* synthetic */ dda(kda kdaVar, byte b) {
        this.a = b;
        this.b = kdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kda kdaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                jda jdaVar = kdaVar.c;
                if (jdaVar != null) {
                    WindowManager windowManager = (WindowManager) kdaVar.b.getSystemService("window");
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    int[] iArr = new int[2];
                    jdaVar.getLocationOnScreen(iArr);
                    int height = (i - (jdaVar.getHeight() + iArr[1])) + ((int) jdaVar.getTranslationY());
                    if (height < kdaVar.k) {
                        ViewGroup.LayoutParams layoutParams = jdaVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Handler handler = kda.f19p;
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (kdaVar.k - height) + marginLayoutParams.bottomMargin;
                            jdaVar.requestLayout();
                        }
                        break;
                    }
                }
                break;
            default:
                jda jdaVar2 = kdaVar.c;
                if (jdaVar2 != null) {
                    if (jdaVar2.getParent() != null) {
                        jdaVar2.setVisibility(0);
                    }
                    if (jdaVar2.getAnimationMode() != 1) {
                        int height2 = jdaVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = jdaVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        jdaVar2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(je5.b);
                        valueAnimator.setDuration(250L);
                        valueAnimator.addListener(new zca(kdaVar, (byte) 1));
                        valueAnimator.addUpdateListener(new bda(kdaVar, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(je5.a);
                        valueAnimatorOfFloat.addUpdateListener(new bda(kdaVar, (byte) 0));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(je5.d);
                        valueAnimatorOfFloat2.addUpdateListener(new bda(kdaVar, (byte) 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(150L);
                        animatorSet.addListener(new zca(kdaVar, (byte) 0));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
