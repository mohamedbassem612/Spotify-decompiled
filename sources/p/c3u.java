package p;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c3u extends o6 implements a4u, k1q0 {
    public final Window N0;
    public final hrr0 O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;

    /* JADX WARN: Multi-variable type inference failed */
    public c3u(Context context, Window window) {
        super(context, (AttributeSet) null, 6, 0);
        this.N0 = window;
        this.O0 = v8r.q(pqo.a);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(this, this);
        mrl1.e(this, new a3u(this));
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1735448596);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ((vu30) this.O0.getValue()).invoke(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(this, i, (byte) 7);
        }
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.S0;
    }

    @Override // p.a4u
    public final Window getWindow() {
        return this.N0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.t(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.N0;
        if (mode != Integer.MIN_VALUE || this.P0 || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.Q0) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = nh5.a.a(window);
            } else if (i3 < 32) {
                iA = sh5.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, os00.INVALID_ID);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, os00.INVALID_ID);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.Q0 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(os00.INVALID_ID);
        if (this.P0) {
            return;
        }
        window.setLayout(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hsl1 x(View view, hsl1 hsl1Var) {
        if (!this.Q0) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return hsl1Var.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return hsl1Var;
    }
}
