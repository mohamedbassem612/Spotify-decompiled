package p;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class peh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ zwa a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ ValueAnimator c;
    public final /* synthetic */ ViewGroup.MarginLayoutParams d;

    public peh(zwa zwaVar, TextView textView, ValueAnimator valueAnimator, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.a = zwaVar;
        this.b = textView;
        this.c = valueAnimator;
        this.d = marginLayoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int lineCount;
        TextView textView = this.b;
        textView.getClass();
        Layout layout = textView.getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            int iIntValue = ((Integer) this.c.getAnimatedValue()).intValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = this.d;
            marginLayoutParams.setMarginStart(iIntValue);
            marginLayoutParams.leftMargin = iIntValue;
            ((View) this.a.b).requestLayout();
        }
    }
}
