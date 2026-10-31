package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class lk5 extends SeekBar {
    private final mk5 a;

    public lk5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kfe1.a(getContext(), this);
        mk5 mk5Var = new mk5(this);
        this.a = mk5Var;
        mk5Var.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        mk5 mk5Var = this.a;
        lk5 lk5Var = mk5Var.d;
        Drawable drawable = mk5Var.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(lk5Var.getDrawableState())) {
            lk5Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.d(canvas);
    }

    public lk5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970192);
    }
}
