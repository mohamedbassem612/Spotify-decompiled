package p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wfz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl1 b;

    public /* synthetic */ wfz0(kl1 kl1Var, byte b) {
        this.a = b;
        this.b = kl1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kl1 kl1Var = this.b;
        switch (b) {
            case 0:
                tlv tlvVar = (agz0) kl1Var.b;
                if (tlvVar != null) {
                    tlvVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
            default:
                tlv tlvVar2 = (agz0) kl1Var.b;
                if (tlvVar2 != null) {
                    tlvVar2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
        }
    }
}
