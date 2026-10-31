package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g160 extends FrameLayout implements xly0 {
    public final n650 a;
    public final ImageView b;
    public final f160 c;
    public final fp00 d;
    public final agg1 e;

    public g160(Context context, f160 f160Var) {
        super(context);
        this.c = f160Var;
        n650 n650Var = new n650(context);
        this.a = n650Var;
        if (f160Var != f160.COLOR_ONLY) {
            n650Var.d.setAlpha(255);
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, 0);
            this.d = new fp00(imageView, (byte) 1);
            if (f160Var == f160.IMAGE_AND_COLOR) {
                wfg1 wfg1VarA = new vfg1(0.0f, 0.5f, new yfg1(0.0f, 0.5f)).a(0.0f);
                xrd1[] xrd1VarArr = {new xrd1(imageView, Collections.singletonList(View.ALPHA))};
                wfg1VarA.e.e = Arrays.asList(xrd1VarArr);
                vfg1 vfg1Var = wfg1VarA.f;
                yfg1 yfg1Var = vfg1Var.c;
                this.e = vfg1Var.d;
            } else {
                this.e = agg1.c;
            }
        }
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        if (view == this.b) {
            f160 f160Var = this.c;
            if (f160Var.a) {
                boolean z = f160Var.b;
                n650 n650Var = this.a;
                if (!z || n650Var.b == null) {
                    canvas2 = canvas;
                } else {
                    int iSave = canvas.save();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, n650Var.f, n650Var.e, n650Var.d);
                    canvas2.restoreToCount(iSave);
                }
                boolean zDrawChild = super.drawChild(canvas2, view, j);
                n650Var.a(canvas2);
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // p.xly0
    public ImageView getBackgroundImageView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.c.a) {
            return;
        }
        n650 n650Var = this.a;
        if (n650Var.b != null) {
            int iSave = canvas.save();
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, n650Var.f, n650Var.e, n650Var.d);
            canvas2.restoreToCount(iSave);
        } else {
            canvas2 = canvas;
        }
        n650Var.a(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c.a) {
            fp00 fp00Var = this.d;
            int iD = fp00Var.d(fp00Var.c);
            ImageView imageView = (ImageView) fp00Var.f;
            imageView.layout(0, iD, imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + iD);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.b(getMeasuredWidth(), getMeasuredHeight());
        if (this.c.a) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredHeight2 = getMeasuredHeight();
            fp00 fp00Var = this.d;
            fp00Var.getClass();
            fp00Var.b = measuredHeight;
            if (!fp00Var.d && !fp00Var.e) {
                measuredHeight2 = (int) (measuredHeight2 * 1.4f);
            }
            ((ImageView) fp00Var.f).measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.b(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // p.xly0
    public void setAvoidCroppingImageWithParallax(boolean z) {
        this.d.e = z;
    }

    public void setColor(int i) {
        setSolidColor(i);
    }

    public void setGradientOffset(int i) {
        this.a.g = i;
        invalidate();
    }

    @Override // p.xly0
    public void setHasFixedSize(boolean z) {
        this.d.d = z;
    }

    public void setSolidColor(int i) {
        Paint paint = this.a.d;
        paint.setColor(vno1.j(0.4f, i));
        paint.setAlpha(255);
        invalidate();
    }

    public View getView() {
        return this;
    }
}
