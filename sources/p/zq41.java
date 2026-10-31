package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zq41 extends RecyclerView implements iac0 {
    public final tac0 l2;
    public int m2;
    public int n2;

    /* JADX WARN: Multi-variable type inference failed */
    public zq41(Context context) {
        super(context, (AttributeSet) null, 0);
        tac0 tac0Var = new tac0(this, true);
        this.l2 = tac0Var;
        setNestedScrollingEnabled(false);
        setFocusable(false);
        Drawable drawable = context.getDrawable(2131234024);
        if (drawable != null) {
            imu imuVar = new imu(context);
            imuVar.b = drawable;
            j(imuVar);
        }
        x9p1.p(this, this);
        tac0Var.i(w8c0.b);
    }

    public x8c0 getLifecycle() {
        return this.l2;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tac0 tac0Var = this.l2;
        if (tac0Var.i != w8c0.a) {
            tac0Var.i(w8c0.e);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tac0 tac0Var = this.l2;
        if (tac0Var.i != w8c0.a) {
            tac0Var.i(w8c0.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        if (i == this.m2 && i2 == this.n2 && !isLayoutRequested()) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
        this.m2 = i;
        this.n2 = i2;
    }
}
