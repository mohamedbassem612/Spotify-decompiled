package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bcg extends Drawable {
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ byte a;
    public final Matrix b;
    public final Paint c;
    public final Object d;
    public final Object e;

    public bcg(Bitmap bitmap) {
        this.a = (byte) 0;
        this.d = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.e = bitmapShader;
        this.b = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Paint paint = this.c;
        Matrix matrix = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                Rect bounds = getBounds();
                float fExactCenterX = bounds.exactCenterX();
                float fExactCenterY = bounds.exactCenterY();
                float fMin = Math.min(bounds.width(), bounds.height()) / 2.0f;
                matrix.reset();
                matrix.postTranslate(-fExactCenterX, -fExactCenterY);
                ((BitmapShader) obj).setLocalMatrix(matrix);
                canvas.save();
                canvas.translate(fExactCenterX, fExactCenterY);
                canvas.drawCircle(0.0f, 0.0f, fMin, paint);
                canvas.restore();
                return;
            default:
                RectF rectF = (RectF) obj;
                mr31 mr31Var = (mr31) this.d;
                Bitmap bitmap = mr31Var.a;
                int iSave = canvas.save();
                try {
                    matrix.reset();
                    matrix.setScale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                    mr31Var.d.setLocalMatrix(matrix);
                    paint.setColor(-65536);
                    rectF.set(getBounds());
                    float f2 = mr31Var.b;
                    canvas.drawRoundRect(rectF, f2, f2, mr31Var.e);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        switch (this.a) {
            case 1:
                mr31 mr31Var = (mr31) this.d;
                mr31Var.c = getChangingConfigurations();
                return mr31Var;
            default:
                return super.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return ((Bitmap) this.d).getHeight();
            default:
                return -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return ((Bitmap) this.d).getWidth();
            default:
                return -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                Paint paint = this.c;
                if (paint.getXfermode() == null) {
                    if (paint.getAlpha() == 0) {
                        return -2;
                    }
                    if (paint.getAlpha() == 255 && !((Bitmap) obj).hasAlpha()) {
                        return -1;
                    }
                }
                return -3;
            default:
                mr31 mr31Var = (mr31) obj;
                Paint paint2 = mr31Var.e;
                if (paint2.getXfermode() == null) {
                    if (paint2.getAlpha() == 0) {
                        return -2;
                    }
                    if (paint2.getAlpha() == 255 && !mr31Var.a.hasAlpha()) {
                        return -1;
                    }
                }
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        switch (this.a) {
            case 1:
                return getConstantState().newDrawable();
            default:
                return super.mutate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i);
                break;
            default:
                ((mr31) this.d).e.setAlpha(i);
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(ColorFilter colorFilter) {
    }

    public bcg(Bitmap bitmap, float f2) {
        this.a = (byte) 1;
        this.d = new mr31(bitmap, f2);
        this.b = new Matrix();
        this.e = new RectF();
        this.c = new Paint();
    }
}
