package p;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.LayerDrawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jws extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jws(qws qwsVar, byte b) {
        super(0);
        this.a = b;
        this.b = qwsVar;
    }

    public final Object invoke() {
        byte b = this.a;
        qws qwsVar = this.b;
        switch (b) {
            case 0:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(1000L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.addUpdateListener(new ocg(valueAnimatorOfFloat, qwsVar, (byte) 3));
                valueAnimatorOfFloat.addListener(new kws(qwsVar, valueAnimatorOfFloat, (byte) 0));
                return valueAnimatorOfFloat;
            default:
                return ((LayerDrawable) qwsVar.c.getProgressDrawable()).findDrawableByLayerId(R.id.secondaryProgress);
        }
    }
}
