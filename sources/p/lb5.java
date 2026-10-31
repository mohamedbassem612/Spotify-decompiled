package p;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lb5 extends FrameLayout {
    public static final /* synthetic */ mma0[] e = {new een0(lb5.class, "collapsed", "getCollapsed()Z", 0)};
    public final ce0 a;
    public Function0 b;
    public ValueAnimator c;
    public int d;

    public lb5(Context context) {
        super(context);
        this.a = new ce0(this);
        this.b = ou1.b1;
    }

    public final boolean getCollapsed() {
        mma0 mma0Var = e[0];
        return ((Boolean) ((sgp0) this.a).a).booleanValue();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(i, i2);
        int measuredHeight2 = getCollapsed() ? 0 : getMeasuredHeight();
        if (this.d != measuredHeight2) {
            this.d = measuredHeight2;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getHeight(), this.d);
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.setInterpolator(tyo0.a);
            valueAnimatorOfInt.addUpdateListener(new kb5(this, (byte) 0));
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        } else {
            ValueAnimator valueAnimator2 = this.c;
            Integer num = (Integer) (valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null);
            setMeasuredDimension(getMeasuredWidth(), num != null ? num.intValue() : measuredHeight);
        }
        if (getCollapsed() && measuredHeight > 0 && getMeasuredHeight() == 0) {
            post(new s10(this, (byte) 5));
        }
    }

    public final void setCollapsed(boolean z) {
        this.a.c(e[0], this, Boolean.valueOf(z));
    }
}
