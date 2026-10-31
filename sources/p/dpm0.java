package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dpm0 extends Drawable implements Animatable {
    public boolean N0;
    public long O0;
    public long P0;
    public Picture R0;
    public boolean T0;
    public float Y;
    public float Z;
    public final Movie a;
    public final Bitmap.Config b;
    public final dg41 c;
    public Canvas h;
    public Bitmap i;
    public final Paint d = new Paint(3);
    public final ArrayList e = new ArrayList();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public float t = 1.0f;
    public float X = 1.0f;
    public int Q0 = -1;
    public int S0 = 1;

    public dpm0(Movie movie, Bitmap.Config config, dg41 dg41Var) {
        this.a = movie;
        this.b = config;
        this.c = dg41Var;
        if (fpi1.x(config)) {
            hhg1.n("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.d;
        Canvas canvas2 = this.h;
        Bitmap bitmap = this.i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.t;
            canvas2.scale(f, f);
            this.a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.R0;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.Y, this.Z);
                float f2 = this.X;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        dg41 dg41Var = this.c;
        double dU = fc11.u(iWidth2, iHeight2, iWidth, iHeight, dg41Var);
        if (!this.T0 && dU > 1.0d) {
            dU = 1.0d;
        }
        float f = (float) dU;
        this.t = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.b);
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.i = bitmapCreateBitmap;
        this.h = new Canvas(bitmapCreateBitmap);
        if (this.T0) {
            this.X = 1.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
        } else {
            float fU = (float) fc11.u(i, i2, iWidth, iHeight, dg41Var);
            this.X = fU;
            this.Y = ((iWidth - (i * fU)) / 2.0f) + rect.left;
            this.Z = ((iHeight - (fU * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.N0) {
                this.P0 = SystemClock.uptimeMillis();
            }
            int i = (int) (this.P0 - this.O0);
            int i2 = i / iDuration;
            int i3 = this.Q0;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.T0) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.g;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.t;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.N0 && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.d.getAlpha() != 255) {
            return -3;
        }
        int i = this.S0;
        if (i != 3) {
            return (i == 1 && this.a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.N0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            hhg1.f(f4i1.c(i, "Invalid alpha: "));
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.N0) {
            return;
        }
        this.N0 = true;
        this.O0 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n95) arrayList.get(i)).b();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.N0) {
            this.N0 = false;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n95) arrayList.get(i)).a();
            }
        }
    }
}
