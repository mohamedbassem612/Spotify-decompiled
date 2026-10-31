package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import java.util.WeakHashMap;
import p.b8k1;
import p.dca;
import p.eg;
import p.jot;
import p.kic0;
import p.o5;
import p.oic0;
import p.qic0;
import p.s980;
import p.uic0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class LinearProgressIndicator extends dca {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        uic0 uic0Var = this.a;
        setIndeterminateDrawable(new s980(context2, uic0Var, new kic0(uic0Var), uic0Var.g == 0 ? new oic0(uic0Var) : new qic0(context2, uic0Var)));
        setProgressDrawable(new jot(getContext(), uic0Var, new kic0(uic0Var)));
    }

    @Override // p.dca
    public final void a(int i) {
        uic0 uic0Var = this.a;
        if (uic0Var != null && uic0Var.g == 0 && isIndeterminate()) {
            return;
        }
        super.a(i);
    }

    public int getIndeterminateAnimationType() {
        return this.a.g;
    }

    public int getIndicatorDirection() {
        return this.a.h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        uic0 uic0Var = this.a;
        boolean z2 = true;
        if (uic0Var.h != 1) {
            WeakHashMap weakHashMap = b8k1.a;
            if ((getLayoutDirection() != 1 || uic0Var.h != 2) && (getLayoutDirection() != 0 || uic0Var.h != 3)) {
                z2 = false;
            }
        }
        uic0Var.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        s980 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        jot progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        uic0 uic0Var = this.a;
        if (uic0Var.g == i) {
            return;
        }
        if (b() && isIndeterminate()) {
            eg.m("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        uic0Var.g = i;
        uic0Var.a();
        if (i == 0) {
            s980 indeterminateDrawable = getIndeterminateDrawable();
            oic0 oic0Var = new oic0(uic0Var);
            indeterminateDrawable.Z = oic0Var;
            ((o5) oic0Var).b = indeterminateDrawable;
        } else {
            s980 indeterminateDrawable2 = getIndeterminateDrawable();
            qic0 qic0Var = new qic0(getContext(), uic0Var);
            indeterminateDrawable2.Z = qic0Var;
            ((o5) qic0Var).b = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // p.dca
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.a.a();
    }

    public void setIndicatorDirection(int i) {
        uic0 uic0Var = this.a;
        uic0Var.h = i;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = b8k1.a;
            if ((getLayoutDirection() != 1 || uic0Var.h != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        uic0Var.i = z;
        invalidate();
    }

    @Override // p.dca
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.a.a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969645);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
