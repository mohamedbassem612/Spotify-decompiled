package p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentFeedType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p5g1 extends Drawable implements Runnable {
    public final Paint N0;
    public final Matrix O0;
    public final RectF P0;
    public r5g1 Q0;
    public long R0;
    public int S0;
    public int T0;
    public int U0;
    public float V0;
    public long W0;
    public long X0;
    public final LightingColorFilter Y0;
    public final BitmapShader Z;
    public int Z0;
    public Bitmap a;
    public int b;
    public int c;
    public final int d;
    public final g4b1 e;
    public final g4b1 f;
    public final float g;
    public final yqg h;
    public final Paint i = new Paint();
    public final Rect t = new Rect();
    public final RectF X = new RectF();
    public final RectF Y = new RectF();

    public p5g1(Bitmap bitmap, int i, int i2, int i3, g4b1 g4b1Var, g4b1 g4b1Var2, float f, yqg yqgVar) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = g4b1Var;
        this.f = g4b1Var2;
        this.g = f;
        this.h = yqgVar;
        Bitmap bitmap2 = this.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.Z = bitmapShader;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.N0 = paint;
        this.O0 = new Matrix();
        this.P0 = new RectF();
        this.R0 = Long.MAX_VALUE;
        this.S0 = 255;
        this.T0 = 255;
        int iU = jch0.U(204.0f);
        this.Y0 = new LightingColorFilter(Color.rgb(iU, iU, iU), 0);
        this.Z0 = 1;
        b();
    }

    public final void a(g4b1 g4b1Var, Canvas canvas, int i) {
        int iL = g4b1Var.n.l();
        int iJ = g4b1Var.n.j();
        int i2 = (this.b - iL) / 2;
        int i3 = (this.c - iJ) / 2;
        g4b1Var.setBounds(i2, i3, iL + i2, iJ + i3);
        g4b1Var.setAlpha(i);
        g4b1Var.n.c(canvas);
    }

    public final void b() {
        int iRound;
        this.X.set(0.0f, 0.0f, this.b, this.c);
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int i = this.b;
        int i2 = this.c;
        int iRound2 = 0;
        if (f3 > i / i2) {
            iRound2 = Math.round((f - (i * (f2 / i2))) / 2.0f);
            iRound = 0;
        } else {
            iRound = Math.round((f2 - (i2 * (f / i))) / 2.0f);
        }
        this.t.set(iRound2, iRound, width - iRound2, height - iRound);
        float fE = ktd.e(this.e.n.l(), 2.0f, this.b, 2.0f);
        this.Y.set(fE, fE, this.b - fE, this.c - fE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0042  */
    public final void c() {
        long j;
        long jMax;
        long j2;
        float fB;
        yqg yqgVar = this.h;
        long jC = yqgVar.c();
        int i = this.Z0;
        int i2 = this.T0;
        if (i == 1) {
            if (i2 < 255) {
                this.T0 = Math.max(0, Math.min((((int) (jC - this.W0)) * 255) / AdvertisementType.OTHER, 255));
                j = jC;
            } else {
                j = Long.MAX_VALUE;
            }
        } else if (i2 > 0) {
            this.T0 = 255 - Math.max(0, Math.min((((int) (jC - this.W0)) * 255) / AdvertisementType.OTHER, 255));
            j = jC;
        } else {
            j = Long.MAX_VALUE;
        }
        int i3 = this.Z0;
        int i4 = this.U0;
        if (i3 != 2) {
            if (i4 > 0) {
                this.U0 = 255 - Math.max(0, Math.min((((int) (jC - this.X0)) * 255) / ContentFeedType.OTHER, 255));
            }
            jMax = Math.max(j, jC + 16);
            j2 = this.R0;
            if (j2 != Long.MAX_VALUE && jMax != Long.MAX_VALUE) {
                scheduleSelf(this, jMax);
            } else if (jMax < j2) {
                unscheduleSelf(this);
                scheduleSelf(this, jMax);
            }
            this.R0 = jMax;
        }
        if (i4 < 255) {
            this.U0 = Math.max(0, Math.min((((int) (jC - this.X0)) * 255) / ContentFeedType.OTHER, 255));
        }
        r5g1 r5g1Var = this.Q0;
        if (r5g1Var == null) {
            fB = 0.0f;
        } else {
            if (r5g1Var.b <= 0) {
                r5g1Var = null;
            }
            if (r5g1Var != null) {
                fB = ((yqgVar.b() + r5g1Var.a) - r5g1Var.c) / r5g1Var.b;
            } else {
                fB = 0.0f;
            }
        }
        this.V0 = fB;
        j = jC;
        jMax = Math.max(j, jC + 16);
        j2 = this.R0;
        if (j2 != Long.MAX_VALUE) {
            if (jMax < j2) {
                unscheduleSelf(this);
                scheduleSelf(this, jMax);
            }
        } else if (jMax < j2) {
            unscheduleSelf(this);
            scheduleSelf(this, jMax);
        }
        this.R0 = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c();
        int i = (this.T0 * this.S0) / 255;
        if (i > 0) {
            Rect bounds = getBounds();
            Matrix matrix = this.O0;
            matrix.reset();
            matrix.setScale(bounds.width() / this.a.getWidth(), bounds.height() / this.a.getHeight());
            this.Z.setLocalMatrix(matrix);
            Paint paint = this.N0;
            paint.setAlpha(i);
            paint.setColorFilter(this.Y0);
            RectF rectF = this.P0;
            rectF.set(bounds);
            float f = this.d;
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setColorFilter(null);
            a(this.e, canvas, i);
        }
        int i2 = (this.U0 * this.S0) / 255;
        if (i2 > 0) {
            Paint.Style style = Paint.Style.STROKE;
            Paint paint2 = this.i;
            paint2.setStyle(style);
            paint2.setColor(uah.l(-1, i2));
            paint2.setStrokeWidth(this.g);
            paint2.setAntiAlias(true);
            canvas.drawArc(this.Y, -90.0f, this.V0 * 360.0f, false, paint2);
            a(this.f, canvas, i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b = rect.width();
        this.c = rect.height();
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        invalidateSelf();
        long j = this.R0;
        if (j != Long.MAX_VALUE) {
            scheduleSelf(this, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.S0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
