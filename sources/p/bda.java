package p;

import android.animation.ValueAnimator;
import android.os.Handler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bda implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kda b;

    public bda(kda kdaVar, int i) {
        this.a = (byte) 2;
        this.b = kdaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kda kdaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kdaVar.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jda jdaVar = kdaVar.c;
                jdaVar.setScaleX(fFloatValue);
                jdaVar.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler = kda.f19p;
                kdaVar.c.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler2 = kda.f19p;
                kdaVar.c.setTranslationY(iIntValue2);
                break;
        }
    }

    public /* synthetic */ bda(kda kdaVar, byte b) {
        this.a = b;
        this.b = kdaVar;
    }
}
