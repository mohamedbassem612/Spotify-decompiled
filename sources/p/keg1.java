package p;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class keg1 extends AppCompatTextView {
    public final int N0;
    public final int O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    public final float S0;
    public final r4u T0;
    public ValueAnimator U0;
    public boolean V0;
    public ieg1 W0;
    public String X0;
    public Integer i;
    public final LinkedHashMap t;

    /* JADX WARN: Multi-variable type inference failed */
    public keg1(Context context) {
        super(context, (AttributeSet) null, 0);
        this.t = new LinkedHashMap();
        setGravity(17);
        setMaxLines(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new eg7(this, (byte) 27));
        } else {
            this.i = Integer.valueOf(getWidth());
        }
        this.N0 = context.getColor(2131102465);
        this.O0 = context.getColor(2131104462);
        this.P0 = context.getColor(2131102455);
        this.Q0 = context.getColor(R.color.transparent);
        this.R0 = context.getResources().getDimensionPixelSize(2131167177);
        this.S0 = context.getResources().getDimension(2131167176);
        this.T0 = r4u.d(hcx0.U0, r4u.a(new q881(this, (byte) 23)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTranscriptFont(boolean z) {
        setTextAppearance(z ? 2132018007 : 2132018004);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTranscriptLayout(gku gkuVar) {
        if (gkuVar.g) {
            setMaxLines(4);
            setGravity(8388611);
            setLineSpacing(8.0f, 1.0f);
        } else {
            setMaxLines(1);
            setGravity(17);
            setLineSpacing(0.0f, 1.0f);
        }
    }

    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U0 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gcg1 w(boolean z) {
        Integer num = this.i;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        LinkedHashMap linkedHashMap = this.t;
        Object gcg1Var = linkedHashMap.get(boolValueOf);
        if (gcg1Var == null) {
            setTranscriptFont(z);
            gcg1Var = new gcg1(iIntValue, new dn81(getPaint()), 2);
            linkedHashMap.put(boolValueOf, gcg1Var);
        }
        return (gcg1) gcg1Var;
    }

    public final void x(gku gkuVar) {
        jyv0 jyv0Var = gkuVar.e;
        if (jyv0Var.a.isEmpty()) {
            y();
            return;
        }
        this.W0 = null;
        this.X0 = null;
        this.V0 = gkuVar.g;
        setTranscriptFont(gkuVar.f);
        setTranscriptLayout(gkuVar);
        long j = gkuVar.b + gkuVar.a;
        long jLongValue = Long.valueOf(((iyv0) o7h.A0(jyv0Var.a)).c.b).longValue() - j;
        if (jLongValue <= 0) {
            y();
            return;
        }
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new jeg1(j, jLongValue), Long.valueOf(j), Long.valueOf(jLongValue));
        valueAnimatorOfObject.setDuration(jLongValue);
        valueAnimatorOfObject.setInterpolator(new LinearInterpolator());
        valueAnimatorOfObject.addUpdateListener(new ocg(this, gkuVar, (byte) 5));
        this.U0 = valueAnimatorOfObject;
        if (!gkuVar.c) {
            valueAnimatorOfObject.pause();
        } else {
            if (valueAnimatorOfObject.isRunning()) {
                return;
            }
            if (valueAnimatorOfObject.isPaused()) {
                valueAnimatorOfObject.resume();
            } else {
                valueAnimatorOfObject.start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U0 = null;
        this.W0 = null;
        this.X0 = null;
        setText("");
    }
}
