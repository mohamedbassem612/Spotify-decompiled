package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g3a extends Drawable {
    public static final /* synthetic */ int g = 0;
    public final Drawable a;
    public final dcg b;
    public final f3a c;
    public final Rect d;
    public final Matrix e;
    public final Matrix f;

    public g3a(Drawable drawable, dcg dcgVar, f3a f3aVar) {
        this.a = drawable;
        this.b = dcgVar;
        this.c = f3aVar;
        int intrinsicWidth = dcgVar.getIntrinsicWidth();
        if (intrinsicWidth < 0) {
            hhg1.n("The drawable has no intrinsic measures, set them manually.");
            throw null;
        }
        int intrinsicHeight = dcgVar.getIntrinsicHeight();
        if (intrinsicHeight < 0) {
            hhg1.n("The drawable has no intrinsic measures, set them manually.");
            throw null;
        }
        this.d = new Rect(0, 0, intrinsicWidth, intrinsicHeight);
        this.e = new Matrix();
        this.f = new Matrix();
    }

    public static void a(Drawable drawable, Rect rect, Matrix matrix, boolean z) {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        matrix.reset();
        if (z || intrinsicHeight < 0 || intrinsicWidth < 0) {
            drawable.setBounds(rect);
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        rectF2.set(rect);
        if (rectF.equals(rectF2)) {
            return;
        }
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        matrix.mapRect(rectF);
        float fMax = Math.max(rectF2.width() / rectF.width(), rectF2.height() / rectF.height());
        matrix.postScale(fMax, fMax, rectF2.centerX(), rectF2.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.e;
        boolean zIsIdentity = matrix.isIdentity();
        Drawable drawable = this.a;
        if (zIsIdentity) {
            drawable.draw(canvas);
        } else {
            int iSave = canvas.save();
            canvas.concat(matrix);
            drawable.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        Matrix matrix2 = this.f;
        boolean zIsIdentity2 = matrix2.isIdentity();
        dcg dcgVar = this.b;
        if (zIsIdentity2) {
            dcgVar.draw(canvas);
            return;
        }
        int iSave2 = canvas.save();
        canvas.concat(matrix2);
        dcgVar.draw(canvas);
        canvas.restoreToCount(iSave2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        this.c.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.c.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return Drawable.resolveOpacity(this.a.getOpacity(), this.b.getOpacity());
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        f3a f3aVar = this.c;
        f3aVar.getClass();
        a(this.a, rect, this.e, false);
        int i = rect.right - f3aVar.b;
        Rect rect2 = this.d;
        rect2.offsetTo(i - rect2.width(), (rect.bottom - f3aVar.a) - rect2.height());
        a(this.b, rect2, this.f, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
