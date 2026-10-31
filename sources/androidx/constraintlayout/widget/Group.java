package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import p.ohl;
import p.qhl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class Group extends ohl {
    public Group(Context context) {
        super(context);
    }

    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        qhl layoutParams = getLayoutParams();
        layoutParams.p0.T(0);
        layoutParams.p0.O(0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        d();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
