package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a6f1 extends FrameLayout {
    public boolean N0;
    public float O0;
    public boolean P0;
    public spq0 Q0;
    public final FrameLayout R0;
    public final RectF S0;
    public final RectF T0;
    public final Paint a;
    public z5f1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final float h;
    public float i;
    public int t;

    public a6f1(Context context) {
        super(context);
        Paint paint = new Paint();
        this.a = paint;
        this.Q0 = j5.a;
        this.S0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.T0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        setId(2131431415);
        setWillNotDraw(false);
        Resources resources = getResources();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(x74.D(getContext(), 2131100287));
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167145);
        this.g = dimensionPixelSize;
        this.h = dimensionPixelSize / ((float) Math.sqrt(2.0d));
        this.R0 = (FrameLayout) LayoutInflater.from(getContext()).inflate(2131626267, (ViewGroup) this, true).findViewById(2131431351);
    }

    public final void a(float f) {
        int i = this.f;
        float f2 = ((1.0f - f) * i) / 2.0f;
        float f3 = this.c;
        RectF rectF = this.S0;
        rectF.left = f3;
        int i2 = this.d;
        rectF.top = i2 + f2;
        rectF.right = this.e;
        rectF.bottom = (i2 + i) - f2;
    }

    public spq0 getConfiguration() {
        return this.Q0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.i;
        RectF rectF = this.S0;
        Paint paint = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (this.N0) {
            canvas.save();
            boolean z = this.P0;
            float f2 = this.O0;
            if (z) {
                canvas.translate(f2, rectF.bottom);
            } else {
                canvas.translate(f2, rectF.top);
            }
            canvas.rotate(45.0f);
            canvas.drawRect(this.T0, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setAbove(boolean z) {
        if (this.P0 != z) {
            this.P0 = z;
            invalidate();
        }
    }

    public void setAnimationListener(z5f1 z5f1Var) {
        this.b = z5f1Var;
    }

    public void setArrowOffset(int i) {
        this.O0 = i;
    }

    public void setConfiguration(d4f1 d4f1Var) {
        this.Q0 = spq0.d(d4f1Var);
        ((jj11) d4f1Var).b(LayoutInflater.from(getContext()), this.R0);
    }

    public void setCornerRadius(float f) {
        this.i = f;
    }

    public void setDrawArrowEnabled(boolean z) {
        this.N0 = z;
    }

    public void setHidden(boolean z) {
        if (!z) {
            setVisibility(4);
            return;
        }
        setVisibility(8);
        if (this.Q0.c()) {
            ((d4f1) this.Q0.b()).f(this.R0);
            this.Q0 = j5.a;
        }
    }

    public void setSideMargin(int i) {
        this.t = i;
        FrameLayout frameLayout = this.R0;
        frameLayout.setPadding(i, frameLayout.getPaddingTop(), i, this.R0.getPaddingBottom());
    }
}
