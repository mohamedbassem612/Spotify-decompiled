package p;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class tcx extends MaterialCardView {
    public String Q0;

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m9 */
    public tcx(Context context, AttributeSet attributeSet, int i) throws m9 {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lnz0.a, i, 0);
        this.Q0 = typedArrayObtainStyledAttributes.getString(1);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getDisabledStateReason() {
        return this.Q0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !isEnabled() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        StateListAnimator stateListAnimator = getStateListAnimator();
        if (stateListAnimator != null) {
            stateListAnimator.jumpToCurrentState();
        }
    }

    public final void setDisabledStateReason(String str) {
        this.Q0 = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.m9 */
    @Override // android.view.View
    public void setEnabled(boolean z) throws m9 {
        String str;
        if (!z && ((str = this.Q0) == null || ihc1.y0(str))) {
            throw new m9((byte) 4);
        }
        super.setEnabled(z);
        if (Build.VERSION.SDK_INT >= 30) {
            setStateDescription(!isEnabled() ? this.Q0 : "");
        }
        d7 it = new i46(this, (byte) 8).iterator();
        while (true) {
            d7 d7Var = it;
            if (!d7Var.hasNext()) {
                break;
            } else {
                ((View) d7Var.next()).setImportantForAccessibility(isEnabled() ? 1 : 4);
            }
        }
        setDescendantFocusability(z ? 131072 : 393216);
    }
}
